<%--
  Created by IntelliJ IDEA.
  User: youyujie
  Date: 2018/5/22
  Time: 下午5:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>操作系统占比</title>
    <script src="../js/jquery-3.3.1.min.js"></script>
    <script src="../js/echarts.min.js"></script>
</head>
<body>
    <div id="main" style="height:400px"></div>
    <script type="text/javascript">
        var myChart = echarts.init(document.getElementById('main'));
        option = {
            title : {
                text: '论坛操作系统占比',
                subtext: '2012-01-04',
                x:'center'
            },
            tooltip : {
                trigger: 'item',
                formatter: "{a} <br/>{b} : {c} ({d}%)"
            },
            legend: {
                orient : 'vertical',
                x : 'left',
                data:[]
            },
            toolbox: {
                show : true,
                feature : {
                    mark : {show: true},
                    dataView : {show: true, readOnly: false},
                    magicType : {
                        show: true,
                        type: ['pie', 'funnel'],
                        option: {
                            funnel: {
                                x: '25%',
                                width: '50%',
                                funnelAlign: 'left',
                                max: 1548
                            }
                        }
                    },
                    restore : {show: true},
                    saveAsImage : {show: true}
                }
            },
            calculable : true,
            series : [
                {
                    name:'OS',
                    type:'pie',
                    radius : '55%',
                    center: ['50%', '60%'],
                    data:[]
                }
            ]
        };

        // 异步加载数据
        $.get("/refer/os").done(function (data) {
            // 填入数据
            myChart.setOption({
                legend: {
                    data: data.categories
                },
                series: [{
                    // 根据名字对应到相应的系列
                    name: 'OS',
                    data: data.keyValues
                }]
            });
        });
        // 使用刚指定的配置项和数据显示图表。
        myChart.setOption(option);
    </script>
</body>
</html>
