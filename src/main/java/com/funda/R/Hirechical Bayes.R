#Sys.setlocale("LC_COLLATE","ko_KR.UTF-8")
lct <- Sys.getlocale("LC_TIME");
Sys.setlocale("LC_TIME", lct)
suppressPackageStartupMessages(library(ggplot2))
suppressPackageStartupMessages(library(zoo))
suppressPackageStartupMessages(library(plyr))
suppressPackageStartupMessages(library(lubridate))
suppressPackageStartupMessages(library(bayesm))
suppressPackageStartupMessages(library(googleVis))
library(dlm)

Dat=NULL
storeName=NULL
storeName2=NULL
dat_ext=NULL
dat_mon=NULL
dat_full=NULL
#if (0){
#  for (i in c(1:length(file_name2))){
    #Make dat_full

#    dat <- read.csv(paste("~/Google Drive/Customer/Funda/real_time_data2/",file_name2[i],"_total.csv",sep=""), header=FALSE)
#    colnames(dat)=c("Store_Name","Date","Menu_item","Price")
#    storeName[i]=as.character(dat[1,1])
#    dat=dat[(dat$Price!=0),]
    #dat=dat[!is.numeric(dat$Store_Name),]
    #dat=dat[!(is.na(dat$Price)),]
#    dat_full=rbind(dat_full,dat)
    #write.csv(dat_full,paste("~/Google Drive/Customer/Funda/real_time_data2/","funda_full2_working.csv",sep=""),row.names=F)
    #Read dat_full
#  }
#} else {
#  dat_full=read.csv(paste("C:\Users\wonjun\Downloads\data_full.csv",sep=""),header=T)
#  dat_full=dat
#}



dat_full=read.csv(paste("C:\\gangsugu_rate.csv",sep=""),header=T)
#dat_full=read.csv(paste("C:\\Users\\wonjun\\Downloads\\dataset5.csv",sep=""),header=T)
#dat_full=read.csv(paste("C:\\Users\\wonjun\\Downloads\\dataset5.csv",sep=""),header=T)
#dat_full=read.csv(paste("C:\\Users\\wonjun-pc\\Downloads\\data3.csv",sep=""),header=T)
#dat_full=dat
#print((levels(dat_full[,2])))
dat_full$Date = as.character(dat_full$Date)

#dat_full$date = strftime(dat_full$Date, "%Y-%m-%d %H:%M:%OS")
#dat_full$date = strptime(dat_full$Date, "%Y-%m-%d %H:%M")
dat_full$date = strptime(dat_full$Date, "%Y-%m-%d")
dat_full$year_month <- format(as.yearmon(dat_full$date),"%Y-%m")

#dat_full2=ddply(dat_full, c("Store_Name"), revenue=function(df)sum(df$Price))
#print(length(levels(dat_full[,1])))
#length(levels(dat_full[,16])
for (i in c(1:1)){

  print(paste("the ith: ",i,sep=""))

  storeName2[i]=4

  dat      = subset(dat_full,(dat_full[,16]==storeName2[i]))

  #dat <- dat[,1:16]

  storeName2[i]='??????(12????)'

  dat$date = as.character(dat$Date)
  #dat$date = strptime(dat$Date, "%Y-%m-%d %H:%M:%OS")
  dat$date = strptime(dat$Date, "%Y-%m-%d")

  year_month <- as.yearmon(dat$Date)
  #revenue=rowsum(dat$Price, paste(format(year_month,"%Y-%m"),dat$Menu_item))
  revenue=rowsum(dat$Price, format(year_month,"%Y-%m"))
  #revenue_num =rowsum(dat$Flag, format(year_month,"%Y-%m"))
  #revenue= revenue/revenue_num;

  #k = data.frame(Store_name=storeName2[i], Date=rownames(revenue),Menu_time='',  Price=revenue)

 # tm = rbind(tm, k)
  #revenue=subset(revenue,1:(length(revenue))!=length(revenue))
  #acf(revenue)
  #revenue = aggregate(dat$Price ~ format(year_month,"%Y-%m"), FUN = sum)
  funda=NULL

  month_dat = month(as.yearmon(rownames(revenue)))
  year_dat  = year(as.yearmon(rownames(revenue)))
  launch0   = rep(0,length(revenue))
  launch0[1:4] = c(0,1,1,1)
  funda0       = data.frame(Revenue=revenue,Launch=launch0,Takeoff=1/(1+c(1:length(revenue))),Month=paste("Month_",month_dat,sep=""),dat[,3:16])
  #funda0       = data.frame(Revenue=revenue,Month=paste("Month_",month_dat,sep=""),dat[,4:16])

  #print(funda0)
  #Time=c(1:length(revenue)),
  #funda=data.frame(Revenue=c(rainseries),Time=c(1:length(Rain)),Month=paste("Month_",c(9,10,11,12,1:12,1:6),sep=''))
  outsample_time  = 12
  outsample_month = (month_dat[length(month_dat)]+c(1:outsample_time)-1)%%12+1
  time            = c(1:(length(revenue)+outsample_time))

  takeoff         = 1/(1+time)

  landing         = 1+(1/time)/2
  launch          = rep(0,length(time))
  #launch[1:4]     = c(0,1,1,1)
  seasonality     = paste("Month_",c(month_dat,outsample_month),sep='')
  seasonality_yr  = c(year_dat,outsample_month)
  dat_ext[[i]]=data.frame(Revenue=c(revenue,rep(NA,outsample_time)),Launch=launch,Takeoff=takeoff,Month=seasonality) #Time=time,

  #dat_ext[[i]]<- cbind(dat_ext[[i]], dat[, 4:16])
  #Dat=rbind(Dat,cbind(funda0,Store=paste("Store",i,sep="")))#revenue,X=cbind(Time=landing,Takeoff=takeoff,Month=seasonality))
  Dat[[i]]=list(y=(funda0$Revenue),X=model.matrix(~.,funda0[,-1]))

  #dat_ext[[i]] = Dat[[i]]
  #Aptmm  AptGurae   CD JeonChul AptJeonsae GongGub AptGunsul JigaByun  Mulga   GDPm GDPr Silup Jeonsanup
  funda_insample=cbind(dat_ext[[i]][1:(nrow(revenue)),], dat[1:(nrow(revenue)),3:16])

  dat_ext[[i]]= funda_insample;

  #Launch+Takeoff+
  funda_reg=(lm((Revenue) ~ Launch+Takeoff+Month+Aptmm+AptGurae+CD+JeonChul +AptJeonsae+(GongGub)+(AptGunsul)+JigaByun+Mulga+log(GDPm)+GDPr+Silup+Jeonsanup,data=funda_insample[1:(nrow(revenue)-outsample_time),]))
  #funda_reg=(lm((Revenue)~Month+Aptmm+AptGurae+CD,data=funda_insample[1:(nrow(revenue)-outsample_time),]))
    #funda_reg_pred=predict(funda_reg,Dat[[i]]$x[121:132,])
  funda_reg_pred= predict.glm(funda_reg, newdata= funda_insample[1:(nrow(revenue)),])
  #print(funda_reg_pred)
  #print(summary(funda_reg))
  print(revenue)
  mod1 <- dlmModPoly(order = 1, dV = 15100, dW = 5 * 1468)
  nileFilt2 <- dlmFilter(revenue, mod1)
  gasFore <- dlmForecast(nileFilt2, nAhead = 20)

  plot(window(cbind(nileFilt1$m[-1]), start=1))

  dropFirst(dlmBSample(nileFilt2))
  line(dropFirst(dlmBSample(nileFilt2)))


  #,predicted=exp(funda_reg_pred)/1e6,
  #matplot(data.frame(actual=dat_ext[[i]][,1]/1e6,pred=exp(funda_reg_pred)/1e6),t='l',ylab="Rev")
  matplot(data.frame(actual=Dat[[i]]$y[2:(nrow(revenue))],pred=(funda_reg_pred[2:nrow(revenue)]), pred2=nileFilt2$f[2:nrow(revenue)]),t='l',ylab="Rev_lm",main=paste(storeName2[i]), ylim=c(0.4,1.3), lty=c(1,2,4))
  legend("bottomleft", legend=c("data", "BDM - model1","MLR - model2"), col=c("grey", "green", "red"), lty=c(1,2,4), pch=1, bty='n')



  write.csv(data.frame(actual=Dat[[i]]$y[2:(nrow(revenue))],pred=(funda_reg_pred[2:nrow(revenue)]), pred2=nileFilt2$f[2:nrow(revenue)]), paste(i,"elefund_rev_prediction_18.csv",sep=""))

}



nreg=length(levels(dat_full[,2]))
print(nreg)
ZZ=data.frame(constant=rep(0,nreg),area=c("Seoul","Gyunggi","Busan","Seoul","Incheon","Gyunggi","Busan","Incheon"),Type=c("Restaurant","Coffee","Restaurant","Coffee","Restaurant","Coffee","Chinese","Chinese"))
#ZZ=data.frame(Type=c("Coffee","Coffee","Restaurant","Restaurant","Restaurant","Coffee","Coffee","Coffee"))
ZZ=data.frame(Type=c("GangNam", "Nowon", "Sucho", "Yangchun"))
print(ZZ)
  #ZZ=data.frame(Type=c("Coffee", "Restaurant"))
    Z=model.matrix(~.,(ZZ))[,-1,drop=FALSE]
    Z=Z-rep(colMeans(Z),each=nrow(Z))
  #Z
    Z=NULL
  R=5000

  print(Dat[[1]])
  Data=list(regdata=Dat,Z=Z)
  Mcmc=list(R=R,keep=1)
  set.seed(66)
  out=rhierLinearModel(Data=Data,Mcmc=Mcmc)

  #retailer=levels(factor(paste("Store",c(1:length(levels(dat_full[,1]))),sep="")))
  retailer=levels(dat_full[,2])
  
  burnin=R/2
  betaD=round(apply(out$betadraw,c(1,2),mean),digits=3)

  sig_D=function(A){
    quantile(A,0.05)*quantile(A,0.95)>0
  }
  betaD_sig=apply(out$betadraw[,,burnin:R],c(1,2),sig_D)
  betaDD=betaD
  rownames(betaD)=retailer
  betaDD=round(betaDD,digits=3)
  betaDD=cbind(retailer,betaDD)
  colnames(betaDD)[-1]=names(funda_reg[1]$coefficients)
  colnames(betaDD)[1]="Unit"


  #Graphs HH linear model
  par(mfrow=c(1,1));
  dat_mon=NULL
  pred_sum_revenue=NULL
  total_revenue=NULL
  avg_revenue=NULL
  print(funda_reg[1]$coefficients)
  print(dat_ext[[1]])
  print(betaDD[1:4,])
  print(levels(dat_full[,2]))

  for (i in c(1:length(levels(dat_full[,2])))){
    for (j in c(1:length(funda_reg[1]$coefficients))){

      funda_reg[1]$coefficients[j]=as.numeric(betaDD[i,(j+1)])

    }
    #print(dat_ext[[i]][,4:16])
    funda_reg_pred_bayes=predict(funda_reg,dat_ext[[i]])
    dat_ext[[i]]$predict=(funda_reg_pred_bayes)
    dat_ext[[i]]$store_Name=retailer[i]
    dat_mon=rbind(dat_mon,dat_ext[[i]])


    #matplot(data.frame(actual=dat_ext[[i]][,1]/1e6,pred=exp(funda_reg_pred_bayes)/1e6),t='l',ylab="Rev",family='Korea1',main=paste(retailer[i]))
    matplot(data.frame(actual=dat_ext[[i]][,1],pred=(funda_reg_pred_bayes)),t='l',ylab="Rev",family='Korea1',main=paste(retailer[i]))
    #Sys.sleep(0.2)
    total_revenue[i]=(sum(dat_ext[[i]]$Revenue,na.rm=T))
    avg_revenue[i]=(sum(dat_ext[[i]]$Revenue,na.rm=T)/sum(!is.na(dat_ext[[i]]$Revenue)))
    #Sum the predicted revenue
    pred1=dat_ext[[i]]$predict
    l1=length(pred1)
    pred1[l1-outsample_time:l1]
    pred_sum_revenue[i]=sum(pred1[(l1-outsample_time+1):l1])

    #Line3 <-  gvisLineChart(data.frame(xbar=dat_ext[[i]][,4], actual=dat_ext[[i]][,1]/1e6,pred=exp(funda_reg_pred_bayes)/1e6),yvar=c("actual","pred"), xvar="xbar")
    #plot(Line3)
  }


  names(pred_sum_revenue)=retailer
  barplot(pred_sum_revenue,main="Pred. sum of revenue 12 month",horiz=T)
  compare_rev=data.frame(total_rev=12*avg_revenue,pred_12m_rev=pred_sum_revenue)
  predict_12m_rev=data.frame(retailer=retailer,pred_12m_rev=avg_revenue)
  compare_rev$pop.html.tooltip=retailer
  Bar=gvisBarChart(predict_12m_rev,options=list(height=800, title="Next 12 Month Revenue Prediction",tooltip="{isHtml:'True'}", hAxis="{title:'Pred 12 Month Revenue'}",vAxis="{title:'Store Name'}"))

  cat(Bar$html$chart)

  plot(Bar)
  write.csv(pred_sum_revenue,"funda_rev_prediction.csv")



  out=NULL
  dat=NULL
  dat_full=NULL
  dat_full2=NULL


