###数据库表格

CREATE TABLE USER (
id int PRIMARY key AUTO_INCREMENT,
#用户邮箱
email CHAR(64) NOT NULL,
#用户密码
passwd CHAR(64) NOT NULL,
#用户头像
imgPath VARCHAR(128),
#用户创建时间
createDate char(20) NOT NULL,
#是否被激活 0,表示没有激活,1表示已经激活了
`status` INT DEFAULT 0
);
#用户的其他账号
CREATE TABLE ACCOUNT(
id int PRIMARY key,
#昵称
nike VARCHAR(30),
#邮件
email CHAR(50),
#用户头像
imgPath VARCHAR(128),
#性别
sex CHAR(8),
#地区
region CHAR(10)
);
