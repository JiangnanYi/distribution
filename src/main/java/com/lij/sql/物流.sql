drop database if exists LogisticsDB;
create database LogisticsDB;
use LogisticsDB;
create table Customer									-- 消费者 
(
cuID varchar(20) PRIMARY KEY,
customerName varchar(20),
customerPsd	varchar(20),
customerSex	char(10),
Brithday datetime,
Tel	varchar(20),
Address	varchar(50),
`Comment` varchar(100)
);
INSERT into Customer VALUES('001','李明','123456','男','1998-02-10','18777769543','南方IT学院','很帅');

create table Province				-- 省
(
provinceID varchar(20) PRIMARY KEY,
ProvinceName varchar(20)
);
INSERT into Province VALUES('001','广东省');

create table City				-- 市
(
cityID	varchar(20) primary key not null,
provinceID	varchar(20) references Province(provinceID),
cityName	varchar(20),
provinceName	varchar(20)
);
INSERT into City VALUES('001','001','广东省','珠海市');

create table CityArea				-- 县
(
areaID varchar(20) primary key not null,
cityID	varchar(20) references City(areaID),
rangeID	varchar(20) references DeliveryRange(cityID),
areaName	varchar(20),
cityName	varchar(20)
);
INSERT into CityArea VALUES('001','001','001','白蕉镇','珠海市');

create table Role	-- 角色
(
roleID	varchar(20) primary key not null,
roleName varchar(20),
`Comment` varchar(100)
);
INSERT into Role VALUES('001','张东明','很帅');

create table Manager	-- 管理员
(
mgID varchar(20) primary key not null,
roleID varchar(20) references Role(roleID),
managerName varchar(20), 
managerPsd varchar(20),
managerSex char(10),
Tel varchar(20),
Address varchar(20),
`Comment` varchar(100)
);
INSERT into Manager VALUES('001','001','张东明','123456','男','18777767434','广东佛山','暂无');

create table DeliveryPlace	-- 交货地点
(
dePID	varchar(20) primary key not null,
mgID	varchar(20) references Manager(mgID),
dePNAme	varchar(20),
provinceName	varchar(20),
cityName	varchar(20),
mgName	varchar(20),
dePTel	varchar(20),
dePAddr	varchar(100),
`Comment`	varchar(100)
);
INSERT into DeliveryPlace VALUES('001','001','张明','广东','珠海','张东明','18777767434','广东佛山','暂无');

create table DeliveryRange	-- 送货单
(
rangeID	varchar(20) primary key not null,
dePID	varchar(20)  references DeliveryPlace(dePID),
areaID	varchar(20)  references CityArea(areaID),
rangeName	varchar(20),
deliveiyPrice	decimal(20),
`Comment`	varchar(100)
);
INSERT into DeliveryRange VALUES('001','001','001','广东珠海',354,'暂无');

create table Route						-- 路线
(
routeID	varchar(20) primary key not null,
cityID	varchar(20) references City(cityID),
provinceID	varchar(20) references Province(provinceID),
routeName	varchar(20),
startProvince	varchar(20),
startCity	varchar(20),
endProvince	varchar(20),
endCity	varchar(20),
midProvince	varchar(20),
midCity	varchar(20),
trdnsportPrice	decimal(20),
`Comment`	varchar(100)
);
INSERT into Route VALUES('001','001','001','广昆高速','广东','珠海','广西','南宁','贵州','昆明',300,'暂无');

create table Car											-- 车辆
(
carID	varchar(20) primary key not null,
routeID	varchar(20) references Route(routeID),
carType	varchar(20),
carOrgin	varchar(50),
carProDate	datetime,
carBuyDate	datetime,
carCapacity	int,
carState	bit,
`Comment`	varchar(100)

);
INSERT into Car VALUES('001','001','大众','广东','2018-10-21','2018-10-23',4,1,'暂无');

create table `Order`							-- 订单
(
orderID varchar(20) primary key not null,
carID varchar(20) references Customer(cuID),
cuID varchar(20) references Car(carID),
postPName varchar(20),
postPTel varchar(20),
postPAddr varchar(20),
getPName varchar(20),
getPTel varchar(20),
getPAddr varchar(20),
goodsName varchar(20),
goodsWeight int,
orderType varchar(20),
orderState varchar(20),
trdnsportPrice decimal(18,0),
deliveryPrice decimal(18,0),
totalPrice varchar(20),
`Comment` varchar(100)
);
INSERT into `Order` VALUES('001','001','001','小李','18777695854','珠海','小刘','18777769585','南宁','早餐奶',20,'乳制品','1',20,30,30,'暂无');


create table DeliveRyReceipt											-- 交货回单
(
delivervReceiptID varchar(20) primary key not null,
startCity	varchar(20),
endCity	varchar(20),
midCity	varchar(20),
makeDtae	datetime,
State	varchar(20),
`Comment`	varchar(100)
);
INSERT into DeliveRyReceipt VALUES('001','南宁','南宁','广州','2018-10-19','1','暂无');

create table Association_1											-- 交货回单
(
Ord_orderID	varchar(20) references `Order`(orderID),
Del_deliveryReceiptID	varchar(20) references DeliveRyReceipt(delivervReceiptID),
orderID	varchar(20),
deliveryReceiptID	varchar(20),
PRIMARY KEY  (Ord_orderID,Del_deliveryReceiptID)
);
INSERT into Association_1 VALUES('001','001','001','001');


