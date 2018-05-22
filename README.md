# 日志论坛分析系统
**统计计日志每天的PV、UV、IP以及人均访问次数，根据时间维度、**
**地域维度和操作系统的维度以及浏览器的维度来可视化的
显示每一天的PV、UV、IP以及根据小时为维度显示PV**
# 几个基本概念
**PV(访问量)： 即Page View,即页面浏览量或点击量，用户每次刷新即被计算一次。
UV(独立访客)：即Unique　Visitor,访问您网站的一台电脑客户端为一个访客。00:00-24:00内相同的客户端只被计算一次。
IP、PV、UV的区别：
IP(独立IP)：某IP地址的计算机访问网站的次数。这种统计方式很容易实现，具有真实性。所以是衡量网站流量的重要指标。
PV(访问量)：PV反映的是浏览某网站的页面数，所以每刷新一次也算一次。就是说PV与来访者的数量成正比，但PV并不是页面的来访者数量，而是网站被访问的页面数量。
UV(独立访客)：可以理解成访问某网站的电脑的数量。网站判断来访电脑的身份是通过来访电脑的cookies实现的。如果更换了IP后但不清除cookies，再访问相同网站，该网站的统计中UV数是不变的。
IP(独立IP)反映的是网络地址对象的数量，UV(独立访客)反映的是实际使用者的数量，每个UV相对于每个ip更准确地对应一个实际的浏览者。**
# 页面显示
## 根据小时统计PV
![每小时的PV](https://github.com/oeljeklaus-you/ForumLogAnaloyze/blob/master/PV.png)
## 访客操作系统统计
![访客操作系统占比](https://github.com/oeljeklaus-you/ForumLogAnaloyze/blob/master/OS.png)
## 访客浏览器占比
![访客浏览器占比](https://github.com/oeljeklaus-you/ForumLogAnaloyze/blob/master/Browser.png)
## 访客地域统计
![访客地域统计](https://github.com/oeljeklaus-you/ForumLogAnaloyze/blob/master/Province.png)
# 开发步骤
**日志数据规则(MapReduce)---->生成贴源表(Hive)---->建立维度表(Hive)---->数据抽离(Hive)---->导入Sqoop----->导出Mysql---->数据可视化(Spring+SpringMVC+MyBatis+Maven+Echarts)**
# 使用的技术
**Hadoop(MapReduce) 
Hadoop(Hive)
Sqoop
Spring
SpringMVC
MyBatis
Maven**
# 数据清洗
**关于网站日志数据和数据详情清洗详情,请移步到https://github.com/oeljeklaus-you/LogAnalyzeHelper**
