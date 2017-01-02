########### final model
library(MCMCpack)
rcat = function(p,normalize=F){
  if(normalize==F) p=p/sum(p)
  min(which((runif(1)<cumsum(p))==T))
}

loglike = function(y,x,pi,beta,mu,sigma){
  ll=0
  for(t in 1:length(y)){
    p=0
    for(k in 1:length(pi)){
      p=p+pi[k]*dnorm(y[t]-as.numeric(x[t,]%*%beta),mu[k],sigma[k])
    }
    ll=ll+log(p)
  }
  ll
}

runMCMC=function(y,x,alpha=0.1,eta=10000000,a=0,b=0,nMCMC=500,seed=100,burnin=100,thin=1){
  set.seed(seed)
  K=3
  n=length(y)
  D=ncol(x)
  lm_res=lm(y~x-1)
  beta=as.numeric(lm_res$coefficients)
  s=eta
  r=as.numeric(lm_res$residuals)
  mu=runif(K,min(r),max(r))
  sigma=rep(sd(r)/K,K)
  tau=rep(1,K)
  range=1:100/10
  z=c()
  for(t in 1:n) z[t]=rcat(rep(1/K,K))
  N_k=as.numeric(table(z))
  M=list()
  for(k in 1:K) M[[k]]=which(z==k)
  ll=c()
  
  pi_s=matrix(0,nrow=nMCMC/thin,ncol=K)
  beta_s=matrix(0,nrow=nMCMC/thin,ncol=D)
  mu_s=matrix(0,nrow=nMCMC/thin,ncol=K)
  sigma_s=matrix(0,nrow=nMCMC/thin,ncol=K)
  tau_s=matrix(0,nrow=nMCMC/thin,ncol=K)
  
  for(i in 1:burnin){  
    ## pi
    pi=rdirichlet(1,alpha+N_k)
    
    
    ## mu
    for(k in 1:K){
      mu[k]=rnorm(1,sum(y[M[[k]]]-x[M[[k]],]%*%beta)/(sigma[k]^2/eta^2+N_k[k]),sqrt(1/(1/eta^2+N_k[k]/sigma[k]^2)))
    }
    
    
    ## sigma
    Q=b
    for(k in 1:K){
      Q=Q+sum((y[M[[k]]]-x[M[[k]],]%*%beta-mu[k])^2)/(2*tau[k])
    }
    sigma[1]=sqrt(rinvgamma(1,a+n/2,Q))
    
    
    ## tau
    for(k in 2:K){
      p=c()
      for(l in 1:length(range)){
        p[l]=-N_k[k]/2*log(range[l])-sum((y[M[[k]]]-x[M[[k]],]%*%beta-mu[k])^2)/(2*range[l]*sigma[1]^2)
      }
      p=p-max(p)
      p=exp(p)
      
      tau[k]=range[rcat(p)]
      sigma[k]=sqrt(tau[k])*sigma[1]
    }
    
    
    ## z
    for(t in 1:n){
      N_k[z[t]]=N_k[z[t]]-1
      p=c()
      for(k in 1:K){
        p[k]=pi[k]*dnorm(y[t]-x[t,]%*%beta,mu[k],sigma[k])
      }
      z[t]=rcat(p)
      N_k[z[t]]=N_k[z[t]]+1
    }
    for(k in 1:K) M[[k]]=which(z==k)
    
    
    ## beta
    for(d in 1:D){
      A=0;B=0
      for(k in 1:K){
        A=A+sum(x[M[[k]],d]^2)/(sigma[k]^2)
        B=B+sum((y[M[[k]]]-x[M[[k]],-d]%*%beta[-d]-mu[k])*x[M[[k]],d])/(sigma[k]^2)
      }
      beta[d]=rnorm(1,B/(1/s^2+A),sqrt(1/(1/s^2+A)))
    }
  }
  
  for(i in 1:nMCMC){  
    ## pi
    pi=rdirichlet(1,alpha+N_k)
    
    
    ## mu
    for(k in 1:K){
      mu[k]=rnorm(1,sum(y[M[[k]]]-x[M[[k]],]%*%beta)/(sigma[k]^2/eta^2+N_k[k]),sqrt(1/(1/eta^2+N_k[k]/sigma[k]^2)))
    }
    
    
    ## sigma
    Q=b
    for(k in 1:K){
      Q=Q+sum((y[M[[k]]]-x[M[[k]],]%*%beta-mu[k])^2)/(2*tau[k])
    }
    sigma[1]=sqrt(rinvgamma(1,a+n/2,Q))
    
    
    ## tau
    for(k in 2:K){
      p=c()
      for(l in 1:length(range)){
        p[l]=-N_k[k]/2*log(range[l])-sum((y[M[[k]]]-x[M[[k]],]%*%beta-mu[k])^2)/(2*range[l]*sigma[1]^2)
      }
      p=p-max(p)
      p=exp(p)
      
      tau[k]=range[rcat(p)]
      sigma[k]=sqrt(tau[k])*sigma[1]
    }
    
    
    ## z
    for(t in 1:n){
      N_k[z[t]]=N_k[z[t]]-1
      p=c()
      for(k in 1:K){
        p[k]=pi[k]*dnorm(y[t]-x[t,]%*%beta,mu[k],sigma[k])
      }
      z[t]=rcat(p)
      N_k[z[t]]=N_k[z[t]]+1
    }
    for(k in 1:K) M[[k]]=which(z==k)
    
    
    ## beta
    for(d in 1:D){
      A=0;B=0
      for(k in 1:K){
        A=A+sum(x[M[[k]],d]^2)/(sigma[k]^2)
        B=B+sum((y[M[[k]]]-x[M[[k]],-d]%*%beta[-d]-mu[k])*x[M[[k]],d])/(sigma[k]^2)
      }
      beta[d]=rnorm(1,B/(1/s^2+A),sqrt(1/(1/s^2+A)))
    }
    
    if(i%%thin==0){
      ll[i/thin]=loglike(y,x,pi,beta,mu,sigma)
      
      pi_s[i/thin,]=pi
      beta_s[i/thin,]=beta
      mu_s[i/thin,]=mu
      sigma_s[i/thin,]=sigma
      tau_s[i/thin,]=tau
    }
  }
  
  list(pi=pi,beta=beta,mu=mu,sigma=sigma,z=z,ll=ll,pi_s=pi_s,beta_s=beta_s,mu_s=mu_s,sigma_s=sigma_s,tau_s=tau_s)
}

dat=list()
data=read.csv("C:\\프로젝트\\FUNDA\\일 매출 데이터\\8street.csv")
dat[[1]]=aggregate(data[,2],list(data[,1]),sum)
data=read.csv("C:\\프로젝트\\FUNDA\\일 매출 데이터\\더착한커피 광흥창점.csv")
dat[[2]]=aggregate(data[,2],list(data[,1]),sum)
data=read.csv("C:\\프로젝트\\FUNDA\\일 매출 데이터\\피자팩토리.csv")
dat[[3]]=aggregate(data[,2],list(data[,1]),sum)
data=read.csv("C:\\프로젝트\\FUNDA\\일 매출 데이터\\STEFFHOTDOG.csv")
dat[[4]]=aggregate(data[,2],list(data[,1]),sum)
data=read.csv("C:\\프로젝트\\FUNDA\\일 매출 데이터\\얌샘.csv")
dat[[5]]=aggregate(data[,2],list(data[,1]),sum)
data=read.csv("C:\\프로젝트\\FUNDA\\일 매출 데이터\\CITTI CAFFE.csv")
dat[[6]]=aggregate(data[,2],list(data[,1]),sum)
data=read.csv("C:\\프로젝트\\FUNDA\\일 매출 데이터\\베이커리카페 셀란.csv")
dat[[7]]=aggregate(data[,2],list(data[,1]),sum)
data=read.csv("C:\\프로젝트\\FUNDA\\일 매출 데이터\\더착한커피 신촌점.csv")
dat[[8]]=aggregate(data[,2],list(data[,1]),sum)
data=read.csv("C:\\프로젝트\\FUNDA\\일 매출 데이터\\브레드랩.csv")
dat[[9]]=aggregate(data[,2],list(data[,1]),sum)
dat[[10]]=read.csv("C:\\프로젝트\\FUNDA\\일 매출 데이터\\에뛰드하우스.csv")
dat[[11]]=read.csv("C:\\프로젝트\\FUNDA\\일 매출 데이터\\육가.csv")
dat[[12]]=read.csv("C:\\프로젝트\\FUNDA\\일 매출 데이터\\보통도시락.csv")

for(i in 1:12){
  names(dat[[i]])=c("날짜","매출")
  dat[[i]][,1]=as.Date(dat[[i]][,1])
  dat[[i]]$요일=weekdays(dat[[i]][,1])
  dat[[i]]$월=months(dat[[i]][,1])
  dat[[i]]$요일=factor(dat[[i]]$요일,levels=c("월요일","화요일","수요일","목요일","금요일","토요일","일요일"))
  dat[[i]]$월=factor(dat[[i]]$월,levels=c("1월","2월","3월","4월","5월","6월","7월","8월","9월","10월","11월","12월"))
  for(level in levels(dat[[i]]$요일)){
    dat[[i]][level] <- ifelse(dat[[i]][,"요일"] == level, 1, 0)
  }
  for(level in levels(dat[[i]]$월)){
    dat[[i]][level] <- ifelse(dat[[i]][,"월"] == level, 1, 0)
  }
  dat[[i]]$log매출=log(dat[[i]]$매출)
  dat[[i]]$날짜2=as.numeric(dat[[i]]$날짜-min(dat[[i]]$날짜)+1)
}

set.seed(1000)
res1=list()
for(i in 1:12){
  x=dat[[i]][,-c(1,2,3,4,5,12,24)]
  for(j in dim(x)[2]:1){
    if(length(table(x[,j]))==1)  x=x[,-j]
  }
  x=as.matrix(x)
  y=as.matrix(dat[[i]][,"매출"])
  res1[[i]]=runMCMC(y,x,nMCMC=10000,burnin=500,thin=10,seed=500,a=0,b=0)
  print(i)
}
name=colnames(x)


final5_1=list()
load("C:/프로젝트/FUNDA/final5_1.RData")
for(i in 1:3){
  final5_1[[i]]=res1[[i]]
}
load("C:/프로젝트/FUNDA/final5_2.RData")
for(i in 4:6){
  final5_1[[i]]=res1[[i]]
}
load("C:/프로젝트/FUNDA/final5_3.RData")
for(i in 7:9){
  final5_1[[i]]=res1[[i]]
}
load("C:/프로젝트/FUNDA/final5_4.RData")
for(i in 10:12){
  final5_1[[i]]=res1[[i]]
}


res=final5_1

set.seed(100)
index = sample(1:1000,100)
fitted.value = list()
for ( i in c(1:10,12)){
  cat("iteration=",i,"\n")
  fitted.value[[i]] = matrix(0,100,365)
  
  last=max(dat[[i]][,1])
  last_m=as.numeric(format(last, "%m"))
  if(last_m<10){
    start=as.Date(paste(format(last, "%Y"),paste0("0",last_m+1),"01",sep="-"))
  }else if(last_m<12){
    start=as.Date(paste(format(last, "%Y"),last_m+1,"01",sep="-"))
  }else{
    start=as.Date(paste(as.numeric(format(last, "%Y"))+1,"01","01",sep="-"))
  }
  x = as.Date(0:364,origin=start)
  x = data.frame(x,weekdays(x),months(x))
  names(x)=c("날짜","요일","월")
  x$요일=factor(x$요일,levels=c("월요일","화요일","수요일","목요일","금요일","토요일","일요일"))
  x$월=factor(x$월,levels=c("1월","2월","3월","4월","5월","6월","7월","8월","9월","10월","11월","12월"))
  for(level in levels(x$요일)){
    x[level] <- ifelse(x[,"요일"] == level, 1, 0)
  }
  for(level in levels(x$월)){
    x[level] <- ifelse(x[,"월"] == level, 1, 0)
  }
  x$날짜2=as.numeric(x$날짜-min(dat[[i]]$날짜)+1)
  x=x[,-c(1,2,3,4,11)]
  for(j in dim(x)[2]:1){
    if(length(table(x[,j]))==1)  x=x[,-j]
  }
  x=as.matrix(x)

  for (j in 1:100){
    fitted = x %*% res[[i]]$beta_s[index[j],]
    for (k in 1:365){
      comp = rcat(res[[i]]$pi_s[index[j],])
      error = rnorm(1,res[[i]]$mu_s[index[j],comp],res[[i]]$sigma_s[index[j],comp])
      fitted[k] = fitted[k] + error
    }
    fitted.value[[i]][j,] = fitted
  }
}




###merging

fitted.mean = list()
for (i in c(1:10,12)){
  last=max(dat[[i]][,1])
  last_m=as.numeric(format(last, "%m"))
  if(last_m<10){
    start=as.Date(paste(format(last, "%Y"),paste0("0",last_m+1),"01",sep="-"))
  }else if(last_m<12){
    start=as.Date(paste(format(last, "%Y"),last_m+1,"01",sep="-"))
  }else{
    start=as.Date(paste(as.numeric(format(last, "%Y"))+1,"01","01",sep="-"))
  }
  x = as.Date(0:364,origin=start)
  
  year.month=c()
  for(j in 1:365){
    x_m=as.numeric(format(x[j], "%m"))
    if(x_m<10){
      year.month[j] = paste(format( x[j], '%Y'),"년","0",x_m, "월", sep="")
    }else{
      year.month[j] = paste(format( x[j], '%Y'),"년",x_m, "월", sep="")
    }
  }
  year.month=factor(year.month)
  fitted.mean[[i]]=matrix(0,100,12)
  colnames(fitted.mean[[i]]) = levels(year.month)

  for (k in 1:12){
    fitted.mean[[i]][,k] = rowMeans(fitted.value[[i]][,year.month==levels(year.month)[k]])
  }
}

for(k in c(1:10,12)) boxplot(fitted.mean[[k]])

for(i in 1:12){
  par(mfrow=c(1,1))
  pi=c()
  pi=rbind(pi,round(res[[i]]$pi[1,],3))
  pi=rbind(pi,round(res[[i]]$mu,3))
  pi=rbind(pi,round(res[[i]]$sigma,3))
  loc=paste0("C:\\프로젝트\\FUNDA\\pi",i,".csv")
  write.table(pi,loc,row.names=F,col.names=F,sep=",")
  k=which.max(pi[1,])
  plot(x=1:nrow(dat[[i]]),y=dat[[i]]$매출,type="l",main="매출",xlab="time",ylab="")
  points(x=which(res[[i]]$z==k%%3+1),y=dat[[i]]$매출[which(res[[i]]$z==k%%3+1)],pch=4)
  points(x=which(res[[i]]$z==(k+1)%%3+1),y=dat[[i]]$매출[which(res[[i]]$z==(k+1)%%3+1)],pch=1)
  
  par(mfrow=c(1,2))
  plot(res[[i]]$beta_s[,ncol(res[[i]]$beta_s)],type="l",xlab="iter",ylab="coef",main="trace plot")
  acf(res[[i]]$beta_s[,ncol(res[[i]]$beta_s)],main="autocorrelation function")
  colnames(res[[i]]$beta_s)=name[c(1:(ncol(res[[i]]$beta_s)-1),18)]
  boxplot(res[[i]]$beta_s[,1:6],main="요일 효과")
  boxplot(res[[i]]$beta_s[,7:(ncol(res[[i]]$beta_s)-1)],main="월 효과")
}

beta=c()
for(i in 1:12){
  beta=rbind(beta,as.numeric(round(quantile(res[[i]]$beta_s[,ncol(res[[i]]$beta_s)],c(0.5,0.025,0.975)),1)))
}
write.table(beta,"C:\\프로젝트\\FUNDA\\beta.csv",row.names=F,col.names=F,sep=",")




