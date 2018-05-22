<%--
  Created by IntelliJ IDEA.
  User: youyujie
  Date: 2018/5/22
  Time: 下午7:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="ECharts">
    <meta name="author" content="kener.linfeng@gmail.com">
    <title>ECharts · Example</title>
    <script src="../js/echarts.min.js"></script>
    <script src="../js/china.js"></script>
    <script src="../js/jquery-3.3.1.min.js"></script>
</head>

<body>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=EDGE">
    <title>ECharts</title>
    <link rel="stylesheet" type="text/css" href="css/main.css"/>
    <script src="js/jquery-1.9.1.min.js"></script>
    <script src="js/echarts.min.js"></script>
    <script src="js/china.js"></script>
    <style>#china-map {width:1000px; height: 1000px;margin: auto;}</style>
</head>
<body>

<div id="china-map"></div>

<script>
    var myChart = echarts.init(document.getElementById('china-map'));
    function randomData() {
        return Math.round(Math.random()*1000);
    }

    option = {
        title: {
            text: '访问论坛的地域分布',
            subtext: '2012-01-04',
            left: 'center'
        },
        tooltip: {
            trigger: 'item'
        },
        legend: {
            orient: 'vertical',
            left: 'left',
            data:['PV']
        },
        visualMap: {
            left: 'left',
            top: 'bottom',
            text: ['高','低'],           // 文本，默认为数值文本
            calculable: true
        },
        toolbox: {
            show: true,
            orient: 'vertical',
            left: 'right',
            top: 'center',
            feature: {
                dataView: {readOnly: false},
                restore: {},
                saveAsImage: {}
            }
        },
        series: [
            {
                name: 'Province',
                type: 'map',
                mapType: 'china',
                roam: false,
                label: {
                    normal: {
                        show: true
                    },
                    emphasis: {
                        show: true
                    }
                },
                data:[]
            }
        ]
    };
    // 异步加载数据
    $.get("/refer/province").done(function (data) {
        // 填入数据
        myChart.setOption({
            visualMap:[{
                min:data.min,
                max:data.max
            }],
            series: [{
                // 根据名字对应到相应的系列
                name: 'Province',
                data: data.keyValues2
            }]
        });
    });
    myChart.setOption(option);

</script>

</body>
</html>