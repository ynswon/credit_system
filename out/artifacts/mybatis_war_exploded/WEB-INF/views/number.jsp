
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

        Sys.setlocale("LC_COLLATE","ko_KR.UTF-8")
        suppressPackageStartupMessages(library(ggplot2))
        suppressPackageStartupMessages(library(zoo))
        suppressPackageStartupMessages(library(plyr))
        suppressPackageStartupMessages(library(lubridate))
        suppressPackageStartupMessages(library(bayesm))
        suppressPackageStartupMessages(library(googleVis))
        #library(RMySQL)

        #con <- dbConnect(dbDriver("MySQL"), host = "211.253.8.161", port=3306, dbname = "model1",  user = "model1", password = "funda9123")
        #con <- dbConnect(dbDriver("MySQL"), host = "222.231.28.29", port=3306, dbname = "credit",  user = "credit", password = "17xn16s472jm1mx0al")

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
        #  dat_full=read.csv(paste("~/Google #Drive/Customer/Funda/real_time_data2/","funda_full2_working.csv",sep=""),header=T)
        #  dat_full=dat
        #}


        #dat_full <- dbGetQuery(con, "SELECT * FROM (
        #                      select  (select store_idx from credit.application where idx=ref_idx) as Store_Name
        #                       , concat(substr(series_name,1,4),'-',substr(series_name,6,2),'-01')
        #                       as Date, 'Menu' as Menu_item, value as Price
        #                       , (select count(*) from credit.application_data_series where ref_idx=t.ref_idx and seg_idx='VAN') as cnt
        #                       from credit.application_data_series t
        #                       where t.seg_idx='VAN' and t.ref_idx<=120) TM
        #                       where TM.cnt>=12;
        #                         ")

        #dat_full
        #dat_full=read.csv(paste("C:\\매출data\\24\\sales_delay.csv",sep=""),header=T)
        dat_full=read.csv(paste("/var/www/html/Filemanager/userfiles/sales_delay3.csv",sep=""),header=T)

        dat_full$Date
        dat_full$Date=as.character(dat_full$Date)
        dat_full$date = strftime(dat_full$Date, "%Y-%m-%d")
        dat_full$Store_Name= as.factor(dat_full$Store_Name);
        dat_full$Price = as.numeric(dat_full$Price);

        dat_full$year_month <- format(as.yearmon(dat_full$date),"%Y-%m")
        dat_full2=ddply(dat_full, c("Store_Name"), revenue=function(df)sum(df$Price))

        #dat_full2
        #as.yearmon('2015.05', "%Y.%m")
        length(levels(dat_full[,1]))

        for (i in c(1:length(levels(dat_full[,1])))){
        print(paste("the ith: ",storeName2[i],sep=""))
        storeName2[i]=levels(dat_full[,1])[i]
        dat=subset(dat_full,(dat_full[,1]==storeName2[i]))
        dat$Date=as.character(dat$Date)
        #dat$date = strftime(dat$Date, "%Y-%m-%d %H:%M:%OS")
        dat$date = strftime(dat$Date, "%Y-%m-%d")

        storeName2[i]
        dat$date
        year_month <- as.yearmon(dat$date)
        dat$Price
        #revenue=rowsum(dat$Price, paste(dat$Menu_item,format(year_month,"%Y-%m")))
        revenue=rowsum(dat$Price, format(year_month,"%Y-%m"))
        #length(revenue)
        #revenue=subset(revenue,1:(length(revenue))!=length(revenue))
        revenue
        #acf(revenue)
        #revenue = aggregate(dat$Price ~ format(year_month,"%Y-%m"), FUN = sum)
        storeName2[1]
        funda=NULL
        month_dat=month(as.yearmon(rownames(revenue)))
        year_dat=year(as.yearmon(rownames(revenue)))
        launch0=rep(0,length(revenue))
        launch0[1:4]=c(0,1,1,1)
        funda0=data.frame(Revenue=revenue,Launch=launch0,Takeoff=1/(1+c(1:length(revenue))),Month=paste("Month_",month_dat,sep=""))#Time=c(1:length(revenue)),
        funda0
        #funda=data.frame(Revenue=c(rainseries),Time=c(1:length(Rain)),Month=paste("Month_",c(9,10,11,12,1:12,1:6),sep=''))
        outsample_time=6
        outsample_month=(month_dat[length(month_dat)]+c(1:outsample_time)-1)%%12+1
        time=c(1:(length(revenue)+outsample_time))
        takeoff=1/(1+time)
        landing=1+(1/time)/2
        launch=rep(0,length(time))
        launch[1:4]=c(0,1,1,1)
        seasonality=paste("Month_",c(month_dat,outsample_month),sep='')
        seasonality_yr=c(year_dat,outsample_month)
        #outsample_time

        #revenue[(nrow(revenue)-outsample_time):nrow(revenue)]
        dat_ext[[i]]=data.frame(Revenue=c(revenue,rep(NA,outsample_time)),Launch=launch,Takeoff=takeoff,Month=seasonality)#Time=time,
        dat_ext[[1]]
        #dat_ext[[1]][(nrow(revenue)-outsample_time):nrow(revenue),]
        #Dat=rbind(Dat,cbind(funda0,Store=paste("Store",i,sep="")))#revenue,X=cbind(Time=landing,Takeoff=takeoff,Month=seasonality))
        Dat[[i]]=list(y=log(funda0$Revenue),X=model.matrix(~.,funda0[,-1]))


        funda_insample=dat_ext[[i]][1:(nrow(revenue)-0),]

        funda_insample
        funda_reg=(lm(log(Revenue)~Launch+Takeoff+Month,data=funda_insample))

        print(summary(funda_reg))
        funda_reg_pred=predict(funda_reg,dat_ext[[i]])

        #dat_ext[[1]]
        #funda_reg_pred
        #funda_insample

        #,predicted=exp(funda_reg_pred)/1e6,
        matplot(data.frame(actual=dat_ext[[i]][,1]/1e6,pred=exp(funda_reg_pred)/1e6),t='l',ylab="Rev")

        }

        nreg=length(levels(dat_full[,1]))
        nreg

        #ZZ=data.frame(constant=rep(0,nreg),area=c("구수한설렁탕","농심원정육점","바닷가재(2차)","송원복집","큐브멀티지","회빈")
        #              ,Type=c(1,2,3,4,5,6))
        ZZ=data.frame(Type=c("Coffee","Coffee","Restaurant","Restaurant","Restaurant","Coffee","Coffee","Coffee"))
        Z=model.matrix(~.,(ZZ))[,-1,drop=FALSE]
        Z=Z-rep(colMeans(Z),each=nrow(Z))
        Z
        Z=NULL
        R=5000
        Data=list(regdata=Dat,Z=Z)
        Mcmc=list(R=R,keep=1)
        set.seed(66)
        out=rhierLinearModel(Data=Data,Mcmc=Mcmc)


        #levels(dat_full[,1])
        #retailer=levels(factor(paste("Store",c(1:length(levels(dat_full[,1]))),sep="")))
        retailer=levels(dat_full[,1])
        burnin=R/2
        betaD=round(apply(out$betadraw,c(1,2),mean),digits=3)
        sig_D=function(A){
        quantile(A,0.05)*quantile(A,0.95)>0
        }

        betaD_sig=apply(out$betadraw[,,burnin:R],c(1,2),sig_D)
        betaDD=betaD
        rownames(betaD)=retailer
        retailer
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


        for (i in c(1:length(levels(dat_full[,1])))){
        for (j in c(1:length(funda_reg[1]$coefficients))){
        funda_reg[1]$coefficients[j]=as.numeric(betaDD[i,(j+1)])
        }

        funda_reg_pred_bayes=predict(funda_reg,dat_ext[[i]])
        dat_ext[[i]]$predict=exp(funda_reg_pred_bayes)
        dat_ext[[i]]$store_Name=retailer[i]
        dat_mon=rbind(dat_mon,dat_ext[[i]])
        dat_ext[[i]]

        matplot(data.frame(actual=dat_ext[[i]][,1]/1e6,pred=exp(funda_reg_pred_bayes)/1e6),t='l',ylab="Rev",family='Korea1',main=paste(retailer[i]))
        #Sys.sleep(0.2)
        total_revenue[i]=(sum(dat_ext[[i]]$Revenue,na.rm=T))
        avg_revenue[i]=(sum(dat_ext[[i]]$Revenue,na.rm=T)/sum(!is.na(dat_ext[[i]]$Revenue)))
        #Sum the predicted revenue
        pred1=dat_ext[[i]]$predict
        l1=length(pred1)
        pred_date = dat_ext[[i]]$YearMon

        #dat_ext[[1]]
        #result = data.frame(pred1[l1-outsample_time:l1],'VAN',retailer[i], 'Prediction', Sys.Date() , Sys.Date())
        #colnames(result) = c('value','seg_idx', 'ref_idx','seg_name','series_name','date');
        #result

        #dbWriteTable(con, name= "application_data_series",result, append=TRUE)

        #sql <- sprintf("update application_data_series set row_names='Y'
        #               where ref_idx=%d and seg_idx='VAN'",
        #               retailer[i])
        #rs <- dbSendQuery(con, sql)
        #dbClearResult(rs)

        pred_sum_revenue[i]=sum(pred1[(l1-outsample_time+1):l1])

        plot(density(dat_ext[[i]]$predict),main=paste(retailer[i]),xlab=" ") #,xlim=c(-15,15),ylim=c(0,1)

        write.csv(exp(funda_reg_pred_bayes),paste(paste('revenue_predict',Sys.Date(), sep="_"), retailer[i], 'csv', sep = '.'))
        }

        names(pred_sum_revenue)=retailer
        barplot(pred_sum_revenue,main="Pred. sum of revenue 12 month",horiz=T)
        compare_rev=data.frame(total_rev=12*avg_revenue,pred_12m_rev=pred_sum_revenue)
        predict_12m_rev=data.frame(retailer=retailer,pred_12m_rev=pred_sum_revenue)
        compare_rev$pop.html.tooltip=retailer
        Bar=gvisBarChart(predict_12m_rev,options=list(height=800, title="Next 12 Month Revenue Prediction",tooltip="{isHtml:'True'}", hAxis="{title:'Pred 12 Month Revenue'}",vAxis="{title:'Store Name'}"))

        cat(Bar$html$chart)


        write.csv(pred_sum_revenue,"funda_rev_prediction.csv")


        #dbDisconnect(con)

        out=NULL
        dat=NULL
        dat_full=NULL
        dat_full2=NULL




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