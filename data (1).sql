drop database hotel;
create database hotel;
use hotel;

create table orders(
id int  primary key auto_increment,
roomnumber int not null,
name char(10) not null,
gender  char(2) not null,
idcard char(30) not null,
phone char(12) not null,
roomtype char(12) not null,
money int not null
);

create table roominfo(
roomnumber int primary key auto_increment,
status char(10) not null,
price int not null
);

create table admin(
id int not null auto_increment primary key,
administrator varchar(16)  not null,
password varchar(20) not null,
gender varchar(2) not null,
phone char(11) not null
);

set character_set_client = utf8;
alter table roominfo auto_increment=101;


insert into orders
(roomnumber,name,gender,idcard,phone,roomtype,money)
values
(101,'lt','男','430321199909013115','18888888888','单间',200);

insert into orders
(roomnumber,name,gender,idcard,phone,roomtype,money)
values
(102,'zmw','男','430321199909015115','18888888888','单间',200);

insert into orders
(roomnumber,name,gender,idcard,phone,roomtype,money)
values
(103,'lyg','女','430321199909013115','18888889999','单间',200);

insert into orders
(roomnumber,name,gender,idcard,phone,roomtype,money)
values
(104,'ffy','男','430321199909013115','18888889999','单间',200);

insert into  roominfo
(status,price)
values
('已入住',200);

insert into  roominfo
(status,price)
values
('已入住',200);

insert into  roominfo
(status,price)
values
('已入住',200);

insert into  roominfo
(status,price)
values
('已入住',200);

insert into admin(administrator,password,gender,phone) values('test','123','男','15617889878');
insert into admin(administrator,password,gender,phone) values('mark','1234','女','17378199778');



