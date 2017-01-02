<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page import="java.util.*,com.funda.mybatis.*"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="A fully featured admin theme which can be used to build CRM, CMS, etc.">
    <meta name="author" content="Coderthemes">

    <link rel="stylesheet" href="https://www.numberanalytics.com/css/bootstrap_number.min.css">
    <link rel="shortcut icon" href="/resources/assets/images/favicon.ico">


    <title>Funda Admin</title>

    <!--Morris Chart CSS -->
    <link rel="stylesheet" href="/resources/assets/plugins/morris/morris.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.10.2/jquery.min.js"></script>
    <script type="text/javascript" src="http://code.jquery.com/jquery-latest.js"></script>

    <!-- App css -->
    <link href="/resources/assets/css/bootstrap.min.css" rel="stylesheet" type="text/css" />
    <link href="/resources/assets/css/core.css" rel="stylesheet" type="text/css" />
    <link href="/resources/assets/css/components.css" rel="stylesheet" type="text/css" />
    <link href="/resources/assets/css/icons.css" rel="stylesheet" type="text/css" />
    <link href="/resources/assets/css/pages.css" rel="stylesheet" type="text/css" />
    <link href="/resources/assets/css/menu.css" rel="stylesheet" type="text/css" />
    <link href="/resources/assets/css/responsive.css" rel="stylesheet" type="text/css" />

    <!-- HTML5 Shiv and Respond.js IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
    <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
    <script src="https://oss.maxcdn.com/libs/respond.js/1.3.0/respond.min.js"></script>
    <![endif]-->

    <script src="/resources/assets/js/modernizr.min.js"></script>

    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <title>Number Analytics | Run your own R code</title>



    <script>
    //      username=;
    //When Document is Ready
    $(function () {

        $('#spinning_img').hide();
        //Go R button Click Event Handler
        $("#cmdGoR").click(function () {
            //	var usr_ID=$('#user_id').text();
            $('#spinning_img').show();
            $(this).attr("disabled", true);
// 	      $(this).parent().append('&nbsp<i class="fa fa-refresh fa-spin"></i>');
            var resultsUrlPrefix = "http://52.78.246.148",
                    url = resultsUrlPrefix + "/ocpu/library/base/R/identity/save";
            //var rCommands = "dat=read.csv('"+web_url+"/uploads/data_"+usr_ID +".csv');";
            var rCommands = "";
            rCommands = ' \n ' + rCommands + $("#txtRCommands").val() + ' \n ';
            $.post(url,
                    {
                        x: rCommands
                    },
                    function (data) {

                        var statResultsLink = resultsUrlPrefix + data.toString().match(/.+\/stdout/m);
                        // alert(chartLink);
                        //  });
                        //Add statistical (textual) results to results div
                        $('#results').append("<br/>");
                        $('#results pre').html($('<p/>', {
                            id: 'statResults'
                        }));
                        $("#statResults").load(statResultsLink);
                        //Add charts results to results div
                        content= data.toString().split('\n');
                        $('#plots').html("<br/>");
                        //check the output files
                        for (var i=0; i<=(content.length-2);i++){
                            //Graphic files
                            if (content[i].match(/.+\/graphics\/[0-9]/m)){
                                chartLink= resultsUrlPrefix + content[i];
                                $('#plots').append($('<img/>', {
                                    id: 'chartResults',
                                    class: 'img-responsive',
                                    src: chartLink
                                })).append('<br>');
                                //Files (CSV files text files)
                            } else if (content[i].match(/.+\/files/m)){
                                fileLink= resultsUrlPrefix + content[i];
                                //	alert(fileLink);
                                fileLinkName=fileLink.split('/').pop();
                                if (fileLinkName!='DESCRIPTION'){
                                    $('#output_files').append('<a href="'+fileLink+'">'+fileLinkName+'</a><br>'); //                       id: 'output_files',
//                        href: fileLink
                                    // })).append('<br>');
                                }
                                //Messages
                            } else if (content[i].match(/.+\/messages/m)){
                                msgLink= resultsUrlPrefix + content[i];
                                $("#results pre").prepend($('<div>').load(msgLink));
                            }

                        }
                    })
                    .done(function(data){
//                  $("#results pre").append("Outputs <br>"+data);
                    })
                    .error(function (jqXHR, status, error) {
                        $("#results pre").html("Error <br>"+jqXHR.responseText);
                        $("#plots").html('');
//		  alert(jqXHR.responseText);
                    })
                    .always(function(){
                        $('#cmdGoR').attr("disabled", false);
                        $('#spinning_img').hide();
                    });
        });

    });

    </script>

</head>


<body class="fixed-left">
    <!-- Begin page -->
    <div id="wrapper">

        <!-- Top Bar Start -->
        <div class="topbar">

            <!-- LOGO -->
            <div class="topbar-left">
                <a href="/index" class="logo"><span>Funda<span>Admin</span></span><i class="zmdi zmdi-layers"></i></a>
            </div>

            <!-- Button mobile view to collapse sidebar menu -->
            <div class="navbar navbar-default" role="navigation">
                <div class="container">
                    <!-- Page title -->
                    <ul class="nav navbar-nav navbar-left">
                        <li>
                            <button class="button-menu-mobile open-left">
                                <i class="zmdi zmdi-menu"></i>
                            </button>
                        </li>
                        <li>
                            <h4 class="page-title">매출예측알고리즘</h4>
                        </li>
                    </ul>

                    <!-- Right(Notification and Searchbox -->
                    <ul class="nav navbar-nav navbar-right">
                        <li>
                            <!-- Notification -->
                            <div class="notification-box">
                                <ul class="list-inline m-b-0">
                                    <li>
                                        <a href="javascript:void(0);" class="right-bar-toggle">
                                            <i class="zmdi zmdi-notifications-none"></i>
                                        </a>
                                        <div class="noti-dot">
                                            <span class="dot"></span>
                                            <span class="pulse"></span>
                                        </div>
                                    </li>
                                </ul>
                            </div>
                            <!-- End Notification bar -->
                        </li>
                        <li class="hidden-xs">
                            <form role="search" class="app-search">
                                <input type="text" placeholder="Search/resources."
                                       class="form-control">
                                <a href=""><i class="fa fa-search"></i></a>
                            </form>
                        </li>
                    </ul>

                </div><!-- end container -->
            </div><!-- end navbar -->
        </div>

<!-- Top Bar End -->


<!-- ========== Left Sidebar Start ========== -->
    <jsp:include page="/menu"/>
<!-- Left Sidebar End -->



<!-- ============================================================== -->
<!-- Start right Content here -->
<!-- ============================================================== -->
    <div class="content-page">
    <!-- Start content -->
    <div class="content">
    <div class="container">


    <script type="text/javascript" src="http://code.jquery.com/jquery-latest.js"></script>
    <link rel="stylesheet" href="//maxcdn.bootstrapcdn.com/font-awesome/4.3.0/css/font-awesome.min.css">

    <br>
    <div class="row">
        <div class="col-md-5">
            <div class="page-header">
                <h2>Batch score CSV file</h2>
            </div>

            <p>The scoring function</a> was designed to accept both data as well as a CSV file as input. The example below illustrates batch scoring using CSV files for both input and output. The CSV file must at least contain columns with values for <code>age</code> and <code>marital</code> (<a href="/resources/files/testdata.csv">example data</a>).</p>

            <form role="form">
                <div class="form-group">
                    <!-- <img src="spinner.gif" class="spinner" style="display:none;" />-->
                    <input class="btn btn-primary btn-lg" type="file" id="csvfile">
                    <br>
                    <a class="btn btn-success btn-lg hide" target="_blank" id="outputcsv">Output CSV</a>
                </div>

            </form>

        </div>
    </div>
    <div class="col-md-7">
    <h4>R code <small>Revenue_prediction_bayes</small></h4>
    <form method="POST" action="https://www.numberanalytics.com/RcodeSave" accept-charset="UTF-8" class="form" role="form"><input name="_token" type="hidden" value="oZBZuTuncLlEUQuQ7yfWBtifBTXDe6blDa2ZxlR6">

        <textarea class="form-control" rows="12" cols="80" name="txtRCommands" id="txtRCommands">Sys.setlocale(&quot;LC_COLLATE&quot;,&quot;ko_KR.UTF-8&quot;)
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
        #data=read.csv("C:\\프로젝트\\FUNDA\\일 Sales 데이터\\sales5.csv")
        #dat[[1]]=aggregate(data[,2],list(data[,1]),sum)
        #data=read.csv("C:\\프로젝트\\FUNDA\\일 Sales 데이터\\sales5.csv")
        #dat[[2]]=aggregate(data[,2],list(data[,1]),sum)
        #data=read.csv("C:\\프로젝트\\FUNDA\\일 Sales 데이터\\피자팩토리.csv")
        #dat[[1]]=aggregate(data[,2],list(data[,1]),sum)


        filelist = list.files(path="/usr/lib/R/library/MASS/scripts/Store650/")
        setwd("/usr/lib/R/library/MASS/scripts/Store650")
        length(filelist)
        for(i in 1:length(filelist))
        {
        data=read.csv(filelist[[i]] )
        dat[[i]]=aggregate(data[,2],list(data[,1]),sum)
        }
        write.table(filelist,"/usr/lib/R/library/MASS/scripts/filelist.csv",row.names=F,col.names=F,sep=",")


        for(i in 1:length(filelist)){
        names(dat[[i]])=c("Date","Sales")
        dat[[i]][,1]=as.Date(dat[[i]][,1])
        dat[[i]]$WeekDays=weekdays(dat[[i]][,1])
        dat[[i]]$Month=months(dat[[i]][,1])
        dat[[i]]$WeekDays=factor(dat[[i]]$WeekDays,levels=c("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"))
        dat[[i]]$Month=factor(dat[[i]]$Month,levels=c("January","February","March","April","May","June","July","August","September","October","November","December"))
        for(level in levels(dat[[i]]$WeekDays)){
        dat[[i]][level] <- ifelse(dat[[i]][,"WeekDays"] == level, 1, 0)
        }
        for(level in levels(dat[[i]]$Month)){
        dat[[i]][level] <- ifelse(dat[[i]][,"Month"] == level, 1, 0)
        }
        dat[[i]]$logSales=log(dat[[i]]$Sales)
        dat[[i]]$Date2=as.numeric(dat[[i]]$Date-min(dat[[i]]$Date)+1)

        }


        set.seed(1000)
        res1=list()
        for(i in 1:length(filelist)){
        x=dat[[i]][,-c(1,2,3,4,5,12,24)]
        for(j in dim(x)[2]:1){
        if(length(table(x[,j]))==1)  x=x[,-j]
        }
        x=as.matrix(x)
        y=as.matrix(dat[[i]][,"Sales"])
        res1[[i]]=runMCMC(y,x,nMCMC=5000,burnin=500,thin=10,seed=500,a=0,b=0)
        print(i)
        }
        name=colnames(x)



        #res=final5_1
        res=res1

        #res1[[1]]

        print(res[[1]]$beta_s)
        #c(1:10,12)

        set.seed(100)
        index = sample(1:100,100)
        fitted.value = list()
        length(filelist)
        for ( i in c(1:1)){
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
        names(x)=c("Date","WeekDays","Month")
        x$WeekDays=factor(x$WeekDays,levels=c("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"))
        x$Month=factor(x$Month,levels=c("January","February","March","April","May","June","July","August","September","October","November","December"))
        for(level in levels(x$WeekDays)){
        x[level] <- ifelse(x[,"WeekDays"] == level, 1, 0)
        }
        for(level in levels(x$Month)){
        x[level] <- ifelse(x[,"Month"] == level, 1, 0)
        }
        x$Date2=as.numeric(x$Date-min(dat[[i]]$Date)+1)
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
        for (i in c(1:length(filelist))){
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
        year.month[j] = paste(format( x[j], '%Y'),"Year","0",x_m, "Month", sep="")
        }else{
        year.month[j] = paste(format( x[j], '%Y'),"Year",x_m, "Month", sep="")
        }
        }
        year.month=factor(year.month)
        fitted.mean[[i]]=matrix(0,100,12)
        colnames(fitted.mean[[i]]) = levels(year.month)

        for (k in 1:12){
        fitted.mean[[i]][,k] = rowMeans(fitted.value[[i]][,year.month==levels(year.month)[k]])
        }
        }


        #fitted.mean[[1]]
        for(k in c(1:length(filelist))) boxplot(fitted.mean[[k]])
        #res[[13]]$beta_s[,1:6]

        betalist = c()
        for(i in 1:length(filelist)){
        par(mfrow=c(1,1))
        pi=c()
        pi=rbind(pi,round(res[[i]]$pi[1,],3))
        pi=rbind(pi,round(res[[i]]$mu,3))
        pi=rbind(pi,round(res[[i]]$sigma,3))
        loc=paste0("/usr/lib/R/library/MASS/scripts/pi",i,".csv")
        write.table(pi,loc,row.names=F,col.names=F,sep=",")
        k=which.max(pi[1,])
        plot(x=1:nrow(dat[[i]]),y=dat[[i]]$Sales,type="l",main="Sales",xlab="time",ylab="")
        points(x=which(res[[i]]$z==k%%3+1),y=dat[[i]]$Sales[which(res[[i]]$z==k%%3+1)],pch=4)
        points(x=which(res[[i]]$z==(k+1)%%3+1),y=dat[[i]]$Sales[which(res[[i]]$z==(k+1)%%3+1)],pch=1)

        par(mfrow=c(1,2))
        plot(res[[i]]$beta_s[,ncol(res[[i]]$beta_s)],type="l",xlab="iter",ylab="coef",main="trace plot")
        acf(res[[i]]$beta_s[,ncol(res[[i]]$beta_s)],main="autocorrelation function")
        colnames(res[[i]]$beta_s)=name[c(1:(ncol(res[[i]]$beta_s)-1),18)]
        boxplot(res[[i]]$beta_s[,1:6],main="WeekDays 효과")
        boxplot(res[[i]]$beta_s[,7:(ncol(res[[i]]$beta_s)-1)],main="Month 효과")

        betalist = rbind(betalist, colMeans(res[[i]]$beta_s));
        }


        beta=c()
        for(i in 1:length(filelist)){
        beta=rbind(beta,as.numeric(round(quantile(res[[i]]$beta_s[,ncol(res[[i]]$beta_s)],c(0.5,0.025,0.975)),1)))
        }


        #write.table(betalist,"/usr/lib/R/library/MASS/scripts/betalist_new.csv",row.names=F,col.names=F,sep=",")
        #write.table(beta,"/usr/lib/R/library/MASS/scripts/beta.csv_new",row.names=F,col.names=F,sep=",")


        </textarea>
        <br>
        <input class="btn btn-primary" type="button" value="Run" id="cmdGoR" /> &nbsp<i class="fa fa-refresh fa-spin" id='spinning_img'></i>&nbsp&nbsp

        <button class="btn btn-default" data-toggle="modal" data-target="#openR">Open</button>
        <button class="btn btn-default" data-toggle="modal" data-target="#saveR">Save</button>
        <button class="btn btn-default" data-toggle="modal" data-target="#removeR">Remove</button>
        <button class="btn btn-default" data-toggle="modal" data-target="#clearR">Clear</button>

        <div class="modal fade" id="saveR" tabindex="-1" role="dialog" aria-labelledby="SaveLabel" aria-hidden="true">
            <div class="modal-dialog">
                <div class="modal-content">
                    <div class="modal-header">
                        <h4 class="modal-title" id="SaveLabel">Save</h4>
                    </div>
                    <div class="modal-body" id="modal_body_pred">Save as<BR>
                        <input type="text" class="input-xlarge" name="title" value="Revenue_prediction_bayes1" />
                    </div>
                    <div class="modal-footer">
                        <button type="summit" class="btn btn-primary" id="submit-button">Save</button>
                        <button type="button" class="btn btn-default" data-dismiss="modal">Cancel</button>
                    </div>
                </div>
            </div>
        </div>
    </form>

    <div class="modal fade" id="openR" tabindex="-1" role="dialog" aria-labelledby="OpenLabel" aria-hidden="true">
        <div class="modal-dialog">
            <div class="modal-content">
                <div class="modal-header">
                    <h4 class="modal-title" id="OpenLabel">Open R code</h4>
                </div>
                <div class="modal-body" id="modal_body_pred"><BR>
                    <form method="POST" action="https://www.numberanalytics.com/RcodeOpen" accept-charset="UTF-8" class="form" role="form"><input name="_token" type="hidden" value="oZBZuTuncLlEUQuQ7yfWBtifBTXDe6blDa2ZxlR6"><div class="radio"><label><input type='radio' name='rid' value='2' title='Revenue_prediction_bayes1'>Revenue_prediction_bayes1&nbsp&nbsp[2016-01-28 04:05:38]<BR> </label></div>	    </div>
                <div class="modal-footer">
                    <button type="summit" class="btn btn-primary" id="submit-button">Open</button>
                    <button type="button" class="btn btn-default" data-dismiss="modal">Cancel</button>
                    </form>

                </div>
            </div>
        </div>
    </div>

    <div class="modal fade" id="removeR" tabindex="-1" role="dialog" aria-labelledby="RemoveLabel" aria-hidden="true">
        <div class="modal-dialog">
            <div class="modal-content">
                <div class="modal-header">
                    <h4 class="modal-title" id="RemoveLabel">Remove R code</h4>
                </div>
                <div class="modal-body" id="modal_body_pred"><BR>
                    <form method="POST" action="https://www.numberanalytics.com/RcodeRemove" accept-charset="UTF-8" class="form" role="form"><input name="_token" type="hidden" value="oZBZuTuncLlEUQuQ7yfWBtifBTXDe6blDa2ZxlR6"><div class="radio"><label><input type='radio' name='rid' value='2' title='Revenue_prediction_bayes1' checked>Revenue_prediction_bayes1<BR> </label></div>	    </div>
                <div class="modal-footer">
                    <button type="summit" class="btn btn-primary" id="submit-button">Remove</button>
                    <button type="button" class="btn btn-default" data-dismiss="modal">Cancel</button>
                    </form>

                </div>
            </div>
        </div>
    </div>
    </div>

    <div class="modal fade" id="clearR" tabindex="-1" role="dialog" aria-labelledby="ClearLabel" aria-hidden="true">
        <div class="modal-dialog">
            <div class="modal-content">
                <div class="modal-header">
                    <h4 class="modal-title" id="ClearLabel">Clear R code</h4>
                </div>
                <div class="modal-body" id="modal_body_pred"><BR>
                    <form method="POST" action="https://www.numberanalytics.com/RcodeClear" accept-charset="UTF-8" class="form" role="form"><input name="_token" type="hidden" value="oZBZuTuncLlEUQuQ7yfWBtifBTXDe6blDa2ZxlR6">
                        Do you want clear this R code?
                </div>
                <div class="modal-footer">
                    <button type="summit" class="btn btn-primary" id="submit-button">Clear</button>
                    <button type="button" class="btn btn-default" data-dismiss="modal">Cancel</button>
                    </form>

                </div>
            </div>
        </div>
    </div>
    <br>
    <div class="row">

        <div class="col-md-7">
            <H4> Console </H4>
            <div id="results">
                <pre style="min-height:200px; height:auto; max-height:700px;  overflow: auto;  word-wrap: normal;  white-space: pre;"></pre>
<!--                <p>The data on the cloud is imported as "dat" variable. You can see the data by typing <code>print(summary(dat));</code> into the R code textbox and click "Run" button.-->
            </div>
        </div>

        <div class="col-md-5">

            <H4>Output</H4>
            <ul class="nav nav-tabs" role="tablist">
                <li role="presentation" class="active"><a href="#plots_tab" aria-controls="plots_tab" role="tab" data-toggle="tab">Plots</a></li>
                <li role="presentation"><a href="#files_tab" aria-controls="files_tab" role="tab" data-toggle="tab">Files</a></li>
            </ul>

            <div class="tab-content">
                <div role="tabpanel" class="tab-pane active" id="plots_tab">
                    <div id='plots'>
                    </div>
                </div>
                <div role="tabpanel" class="tab-pane" id="files_tab">
                    <div id='output_files'>
                    </div>
                </div>
            </div>
        </div>
    </div>



    </div> <!-- container -->

    </div> <!-- content -->

<footer class="footer text-right">
    2016 © Funda.
</footer>

</div>


<!-- ============================================================== -->
<!-- End Right content here -->
<!-- ============================================================== -->


<!-- Right Sidebar -->
<div class="side-bar right-bar">
    <a href="javascript:void(0);" class="right-bar-toggle">
        <i class="zmdi zmdi-close-circle-o"></i>
    </a>
    <h4 class="">Notifications</h4>
    <div class="notification-list nicescroll">
        <ul class="list-group list-no-border user-list">
            <li class="list-group-item">
                <a href="#" class="user-list-item">
                    <div class="avatar">
                        <img src="/resources/assets/images/users/avatar-2.jpg" alt="">
                    </div>
                    <div class="user-desc">
                        <span class="name">Michael Zenaty</span>
                        <span class="desc">There are new settings available</span>
                        <span class="time">2 hours ago</span>
                    </div>
                </a>
            </li>
            <li class="list-group-item">
                <a href="#" class="user-list-item">
                    <div class="icon bg-info">
                        <i class="zmdi zmdi-account"></i>
                    </div>
                    <div class="user-desc">
                        <span class="name">New Signup</span>
                        <span class="desc">There are new settings available</span>
                        <span class="time">5 hours ago</span>
                    </div>
                </a>
            </li>
            <li class="list-group-item">
                <a href="#" class="user-list-item">
                    <div class="icon bg-pink">
                        <i class="zmdi zmdi-comment"></i>
                    </div>
                    <div class="user-desc">
                        <span class="name">New Message received</span>
                        <span class="desc">There are new settings available</span>
                        <span class="time">1 day ago</span>
                    </div>
                </a>
            </li>
            <li class="list-group-item active">
                <a href="#" class="user-list-item">
                    <div class="avatar">
                        <img src="/resources/assets/images/users/avatar-3.jpg" alt="">
                    </div>
                    <div class="user-desc">
                        <span class="name">James Anderson</span>
                        <span class="desc">There are new settings available</span>
                        <span class="time">2 days ago</span>
                    </div>
                </a>
            </li>
            <li class="list-group-item active">
                <a href="#" class="user-list-item">
                    <div class="icon bg-warning">
                        <i class="zmdi zmdi-settings"></i>
                    </div>
                    <div class="user-desc">
                        <span class="name">Settings</span>
                        <span class="desc">There are new settings available</span>
                        <span class="time">1 day ago</span>
                    </div>
                </a>
            </li>

        </ul>
    </div>
</div>
<!-- /Right-bar -->

</div>
<!-- END wrapper -->



<script>
    var resizefunc = [];
</script>

<!-- jQuery  -->
<!--
<script src="/resources/assets/js/jquery.min.js"></script>-->
<script src="/resources/assets/js/jquery.1.10.2.js"></script>
<script src="/resources/assets/js/bootstrap.min.js"></script>
<script src="/resources/assets/js/detect.js"></script>
<script src="/resources/assets/js/fastclick.js"></script>
<script src="/resources/assets/js/jquery.blockUI.js"></script>
<script src="/resources/assets/js/waves.js"></script>
<script src="/resources/assets/js/jquery.nicescroll.js"></script>
<script src="/resources/assets/js/jquery.scrollTo.min.js"></script>

<!-- KNOB JS -->
<!--[if IE]>
<script type="text/javascript" src="/resources/assets/plugins/jquery-knob/excanvas.js"></script>
<![endif]-->
<script src="/resources/assets/plugins/jquery-knob/jquery.knob.js"></script>

<!--Morris Chart-->
<!--
<script src="/resources/assets/plugins/morris/morris.min.js"></script>
<script src="/resources/assets/plugins/raphael/raphael-min.js"></script>
<script src="/resources/assets/pages/jquery.dashboard.js"></script>
-->
<!-- Dashboard init -->


<!-- App js -->
<script src="/resources/assets/js/jquery.core.js"></script>
<script src="/resources/assets/js/jquery.app.js"></script>
<script src="/resources/assets/js/opencpu.js"></script>
<script src="/resources/assets/js/app.js"></script>

</body>
</html>