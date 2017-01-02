
/**
* Theme: Adminto Admin Template
* Author: Coderthemes
* Morris Chart
*/


!function($) {
    "use strict";

    function getParams() {
        // 파라미터가 담길 배열
        var param = new Array();

        // 현재 페이지의 url
        var url = decodeURIComponent(location.href);
        // url이 encodeURIComponent 로 인코딩 되었을때는 다시 디코딩 해준다.
        url = decodeURIComponent(url);

        var params;
        // url에서 '?' 문자 이후의 파라미터 문자열까지 자르기
        params = url.substring( url.indexOf('?')+1, url.length );
        // 파라미터 구분자("&") 로 분리
        params = params.split("&");

        // params 배열을 다시 "=" 구분자로 분리하여 param 배열에 key = value 로 담는다.
        var size = params.length;
        var key, value;
        for(var i=0 ; i < size ; i++) {
            key = params[i].split("=")[0];
            value = params[i].split("=")[1];

            param[key] = value;
        }

        return param;
    }

    var MorrisCharts = function() {};

    //creates line chart
    MorrisCharts.prototype.createLineChart = function(element, data, xkey, ykeys, labels, opacity, Pfillcolor, Pstockcolor, lineColors) {
        Morris.Line({
          element: element,
          data: data,
          xkey: xkey,
          ykeys: ykeys,
          labels: labels,
          fillOpacity: opacity,
          pointFillColors: Pfillcolor,
          pointStrokeColors: Pstockcolor,
          behaveLikeLine: true,
          gridLineColor: '#eef0f2',
          hideHover: 'auto',
          lineWidth: '3px',
          pointSize: 0,
          preUnits: ' ',
          resize: true, //defaulted to true
          lineColors: lineColors
        });
    },
    //creates area chart
    MorrisCharts.prototype.createAreaChart = function(element, pointSize, lineWidth, data, xkey, ykeys, labels, lineColors) {
        Morris.Area({
            element: element,
            pointSize: 0,
            lineWidth: 0,
            data: data,
            xkey: xkey,
            ykeys: ykeys,
            labels: labels,
            hideHover: 'auto',
            resize: true,
            gridLineColor: '#eef0f2',
            lineColors: lineColors
        });
    },
    //creates area chart with dotted
    MorrisCharts.prototype.createAreaChartDotted = function(element, pointSize, lineWidth, data, xkey, ykeys, labels, Pfillcolor, Pstockcolor, lineColors) {
        Morris.Area({
            element: element,
            pointSize: 3,
            lineWidth: 1,
            data: data,
            xkey: xkey,
            ykeys: ykeys,
            labels: labels,
            hideHover: 'auto',
            pointFillColors: Pfillcolor,
            pointStrokeColors: Pstockcolor,
            resize: true,
            gridLineColor: '#eef0f2',
            lineColors: lineColors
        });
    },
    //creates Bar chart
    MorrisCharts.prototype.createBarChart  = function(element, data, xkey, ykeys, labels, lineColors) {
        Morris.Bar({
            element: element,
            data: data,
            xkey: xkey,
            ykeys: ykeys,
            labels: labels,
            hideHover: 'auto',
            resize: true, //defaulted to true
            gridLineColor: '#eeeeee',
            barSizeRatio: 0.4,
            barColors: lineColors
        });
    },
    //creates Stacked chart
    MorrisCharts.prototype.createStackedChart  = function(element, data, xkey, ykeys, labels, lineColors) {
        Morris.Bar({
            element: element,
            data: data,
            xkey: xkey,
            ykeys: ykeys,
            stacked: true,
            labels: labels,
            hideHover: 'auto',
            resize: true, //defaulted to true
            gridLineColor: '#eeeeee',
            barColors: lineColors
        });
    },
    //creates Donut chart
    MorrisCharts.prototype.createDonutChart = function(element, data, colors) {
        Morris.Donut({
            element: element,
            data: data,
            resize: true, //defaulted to true
            colors: colors
        });
    },
    MorrisCharts.prototype.init = function() {


        var p = getParams();
        var index = (p["search"]=='' ? 78: p["search"] );



        var $data ="";
        $.ajax({
            type: "GET",
            url: "/v1/kcbdata/"+index+"/segid/019/detail_idx/1",
            async:false,
            success: function(data) {
                $data= data;
                //alert(data[0].seriesName);
              /*$data
                var $data  = [
                    { y: '2008', a: 50, b: 34 },
                    { y: '2009', a: 75, b: 50 },
                    { y: '2010', a: 30, b: 80 },
                    { y: '2011', a: 50, b: 50 },
                    { y: '2012', a: 75, b: 10 },
                    { y: '2013', a: 50, b: 40 },
                    { y: '2014', a: 75, b: 50 },
                    { y: '2015', a: 100, b: 70 }
                ];element, data, xkey, ykeys, labels, opacity, Pfillcolor, Pstockcolor, lineColors*/


            }
        });
        this.createLineChart('morris-line-example-1', $data, 'seriesDetailIdx', ['value'], ['신용평점'],['0.1'],['#ffffff'],['#999999'], ['#ff8acc']);

        $.ajax({
            type: "GET",
            url: "/v1/kcbdata/"+index+"/segid/019/detail_idx/2",
            async:false,
            success: function(data) {
                $data= data;
             //   alert($data[0].seriesName);
                /*$data
                 var $data  = [
                 { y: '2008', a: 50, b: 34 },
                 { y: '2009', a: 75, b: 50 },
                 { y: '2010', a: 30, b: 80 },
                 { y: '2011', a: 50, b: 50 },
                 { y: '2012', a: 75, b: 10 },
                 { y: '2013', a: 50, b: 40 },
                 { y: '2014', a: 75, b: 50 },
                 { y: '2015', a: 100, b: 70 }
                 ];element, data, xkey, ykeys, labels, opacity, Pfillcolor, Pstockcolor, lineColors*/


            }
        });
        this.createLineChart('morris-line-example-2', $data, 'seriesDetailIdx', ['value'], ['신용등급'],['0.1'],['#ffffff'],['#999999'], ['#ff8acc']);

        $.ajax({
            type: "GET",
            url: "/v1/kcbdata/"+index+"/segid/025/detail_idx/1",
            async:false,
            success: function(data) {
                $data= data;
                /*$data
                 var $data  = [
                 { y: '2008', a: 50, b: 34 },
                 { y: '2009', a: 75, b: 50 },
                 { y: '2010', a: 30, b: 80 },
                 { y: '2011', a: 50, b: 50 },
                 { y: '2012', a: 75, b: 10 },
                 { y: '2013', a: 50, b: 40 },
                 { y: '2014', a: 75, b: 50 },
                 { y: '2015', a: 100, b: 70 }
                 ];element, data, xkey, ykeys, labels, opacity, Pfillcolor, Pstockcolor, lineColors*/


            }
        });
        this.createLineChart('morris-line-example-3', $data, 'seriesDetailIdx', ['value'], ['대출계좌수'],['0.1'],['#ffffff'],['#999999'], ['#ff8acc']);
                //create line chart
      //  this.createLineChart('morris-line-example', $data, 'seriesName', ['value'], ['Series A', 'Series B'],['0.1'],['#ffffff'],['#999999'], ['#ff8acc', '#5b69bc']);

        //creating area chart
     /*   var $areaData = [
            { y: '2009', a: 10, b: 20 },
            { y: '2010', a: 75,  b: 65 },
            { y: '2011', a: 50,  b: 40 },
            { y: '2012', a: 75,  b: 65 },
            { y: '2013', a: 50,  b: 40 },
            { y: '2014', a: 75,  b: 65 },
            { y: '2015', a: 90, b: 60 }
        ];
        this.createAreaChart('morris-area-example', 0, 0, $areaData, 'y', ['a', 'b'], ['Series A', 'Series B'], ['#5b69bc', "#35b8e0"]);
*/
        $.ajax({
            type: "GET",
            url: "/v1/kcbdata/"+index+"/segid/025/detail_idx/2",
            async:false,
            success: function(data) {
                $data= data;
                //   alert($data[0].seriesName);
                /*$data
                 var $data  = [
                 { y: '2008', a: 50, b: 34 },
                 { y: '2009', a: 75, b: 50 },
                 { y: '2010', a: 30, b: 80 },
                 { y: '2011', a: 50, b: 50 },
                 { y: '2012', a: 75, b: 10 },
                 { y: '2013', a: 50, b: 40 },
                 { y: '2014', a: 75, b: 50 },
                 { y: '2015', a: 100, b: 70 }
                 ];element, data, xkey, ykeys, labels, opacity, Pfillcolor, Pstockcolor, lineColors*/


            }
        });
        this.createLineChart('morris-line-example-4', $data, 'seriesDetailIdx', ['value'], ['대출잔액'],['0.1'],['#ffffff'],['#999999'], ['#ff8acc']);

        $.ajax({
            type: "GET",
            url: "/v1/kcbdata/"+index+"/segid/025/detail_idx/3",
            async:false,
            success: function(data) {
                $data= data;
                //   alert($data[0].seriesName);
                /*$data
                 var $data  = [
                 { y: '2008', a: 50, b: 34 },
                 { y: '2009', a: 75, b: 50 },
                 { y: '2010', a: 30, b: 80 },
                 { y: '2011', a: 50, b: 50 },
                 { y: '2012', a: 75, b: 10 },
                 { y: '2013', a: 50, b: 40 },
                 { y: '2014', a: 75, b: 50 },
                 { y: '2015', a: 100, b: 70 }
                 ];element, data, xkey, ykeys, labels, opacity, Pfillcolor, Pstockcolor, lineColors*/


            }
        });
        this.createLineChart('morris-line-example-5', $data, 'seriesDetailIdx', ['value'], ['상환금액'],['0.1'],['#ffffff'],['#999999'], ['#ff8acc']);

        $.ajax({
            type: "GET",
            url: "/v1/kcbdata/"+index+"/segid/025/detail_idx/4",
            async:false,
            success: function(data) {
                $data= data;
                //   alert($data[0].seriesName);
                /*$data
                 var $data  = [
                 { y: '2008', a: 50, b: 34 },
                 { y: '2009', a: 75, b: 50 },
                 { y: '2010', a: 30, b: 80 },
                 { y: '2011', a: 50, b: 50 },
                 { y: '2012', a: 75, b: 10 },
                 { y: '2013', a: 50, b: 40 },
                 { y: '2014', a: 75, b: 50 },
                 { y: '2015', a: 100, b: 70 }
                 ];element, data, xkey, ykeys, labels, opacity, Pfillcolor, Pstockcolor, lineColors*/


            }
        });
        this.createLineChart('morris-line-example-6', $data, 'seriesDetailIdx', ['value'], ['대출잔액'],['0.1'],['#ffffff'],['#999999'], ['#ff8acc']);

        $.ajax({
            type: "GET",
            url: "/v1/kcbdata/"+index+"/segid/025/detail_idx/5",
            async:false,
            success: function(data) {
                $data= data;
                //   alert($data[0].seriesName);
                /*$data
                 var $data  = [
                 { y: '2008', a: 50, b: 34 },
                 { y: '2009', a: 75, b: 50 },
                 { y: '2010', a: 30, b: 80 },
                 { y: '2011', a: 50, b: 50 },
                 { y: '2012', a: 75, b: 10 },
                 { y: '2013', a: 50, b: 40 },
                 { y: '2014', a: 75, b: 50 },
                 { y: '2015', a: 100, b: 70 }
                 ];element, data, xkey, ykeys, labels, opacity, Pfillcolor, Pstockcolor, lineColors*/


            }
        });
        this.createLineChart('morris-line-example-7', $data, 'seriesDetailIdx', ['value'], ['연체금액'],['0.1'],['#ffffff'],['#999999'], ['#ff8acc']);

        $.ajax({
            type: "GET",
            url: "/v1/kcbdata/"+index+"/segid/025/detail_idx/6",
            async:false,
            success: function(data) {
                $data= data;
                //   alert($data[0].seriesName);
                /*$data
                 var $data  = [
                 { y: '2008', a: 50, b: 34 },
                 { y: '2009', a: 75, b: 50 },
                 { y: '2010', a: 30, b: 80 },
                 { y: '2011', a: 50, b: 50 },
                 { y: '2012', a: 75, b: 10 },
                 { y: '2013', a: 50, b: 40 },
                 { y: '2014', a: 75, b: 50 },
                 { y: '2015', a: 100, b: 70 }
                 ];element, data, xkey, ykeys, labels, opacity, Pfillcolor, Pstockcolor, lineColors*/


            }
        });
        this.createLineChart('morris-line-example-8', $data, 'seriesDetailIdx', ['value'], ['최장연체일수'],['0.1'],['#ffffff'],['#999999'], ['#ff8acc']);

        //creating area chart with dotted
    /*    var $areaDotData = [
            { y: '2009', a: 10, b: 20 },
            { y: '2010', a: 75,  b: 65 },
            { y: '2011', a: 50,  b: 40 },
            { y: '2012', a: 75,  b: 65 },
            { y: '2013', a: 50,  b: 40 },
            { y: '2014', a: 75,  b: 65 },
            { y: '2015', a: 90, b: 60 }
        ];
        this.createAreaChartDotted('morris-area-with-dotted', 0, 0, $areaDotData, 'y', ['a', 'b'], ['Series A', 'Series B'],['#ffffff'],['#999999'], ['#5b69bc', "#35b8e0"]);

        //creating bar chart
        var $barData  = [
            { y: '2009', a: 100, b: 90 , c: 40 },
            { y: '2010', a: 75,  b: 65 , c: 20 },
            { y: '2011', a: 50,  b: 40 , c: 50 },
            { y: '2012', a: 75,  b: 65 , c: 95 },
            { y: '2013', a: 50,  b: 40 , c: 22 },
            { y: '2014', a: 75,  b: 65 , c: 56 },
            { y: '2015', a: 100, b: 90 , c: 60 }
        ];
        this.createBarChart('morris-bar-example', $barData, 'y', ['a', 'b', 'c'], ['Series A', 'Series B', 'Series C'], ['#ff8acc', '#5b69bc', "#35b8e0"]);

        //creating Stacked chart
        var $stckedData  = [
            { y: '2005', a: 45, b: 180 },
            { y: '2006', a: 75,  b: 65 },
            { y: '2007', a: 100, b: 90 },
            { y: '2008', a: 75,  b: 65 },
            { y: '2009', a: 100, b: 90 },
            { y: '2010', a: 75,  b: 65 },
            { y: '2011', a: 50,  b: 40 },
            { y: '2012', a: 75,  b: 65 },
            { y: '2013', a: 50,  b: 40 },
            { y: '2014', a: 75,  b: 65 },
            { y: '2015', a: 100, b: 90 }
        ];
        this.createStackedChart('morris-bar-stacked', $stckedData, 'y', ['a', 'b'], ['Series A', 'Series B'], ['#71b6f9', '#ebeff2']);

        //creating donut chart
        var $donutData = [
                {label: "Download Sales", value: 12},
                {label: "In-Store Sales", value: 30},
                {label: "Mail-Order Sales", value: 20}
            ];
        this.createDonutChart('morris-donut-example', $donutData, ['#ff8acc', '#5b69bc', "#35b8e0"]);*/
    },
    //init
    $.MorrisCharts = new MorrisCharts, $.MorrisCharts.Constructor = MorrisCharts
}(window.jQuery),

//initializing 
function($) {
    "use strict";
    $.MorrisCharts.init();
}(window.jQuery);