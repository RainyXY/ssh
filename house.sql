drop database house;

create database house;
use house;

create table user(
user_id int auto_increment primary key,
user_email varchar(50),
user_password varchar(20),
user_tel varchar(20),
i_id int
)default charset=utf8;


/************ sell id 1开头*****************************/

create table sellhouse(
s_house_id int auto_increment primary key,
s_house_address varchar(20),
s_house_size varchar(20),
s_house_price varchar(20),
s_house_floor varchar(20),
s_house_pricture longblob,
filename varchar(100),
contextType varchar(100),
s_house_limit varchar(10),
/*******foreign key***********/
user_id int 
)default charset=utf8;

/**************contract***************************/
create table contract(
c_id int auto_increment primary key,
house_id int,
user_id int
)default charset=utf8;

/***************rent房子2开头**************************/ 

create table renthouse(
r_house_id int auto_increment primary key,
r_house_address varchar(20),
r_house_size varchar(20),
r_house_price varchar(20),
r_house_floor varchar(20),	
r_house_picture longblob,
filename varchar(100),
contextType varchar(100),
r_house_note varchar(100),
/*******foreign key***********/		
user_id int
)default charset=utf8;

/***************userstocontracts**************************/ 
create table userstocontracts(
c_id int,
user_id int
);

/*********************identity***************************/

create table identity(
i_id int primary key,
user_id int
);

/***********查询外键**********/
SELECT  CONSTRAINT_CATALOG, 
 CONSTRAINT_SCHEMA, 
 CONSTRAINT_NAME, 
 TABLE_SCHEMA, 
 TABLE_NAME,  
 CONSTRAINT_TYPE  
 FROM 
 information_schema.TABLE_CONSTRAINTS 
 WHERE 
 TABLE_NAME='sellhouse';

-- alter table user add column i_id int;

/* foreign key for user*/

alter table user add foreign key(i_id) references identity(i_id);

/* foreign key for sellhouse*/

alter table sellhouse add foreign key(user_id) references user(user_id);

/* foreign key for renthouse*/
-- alter table renthouse add foreign key(r_user_id) references user(user_id);
alter table renthouse add foreign key(user_id) references user(user_id);

/* foreign key for contracthouse*/

-- alter table contract add foreign key(c_rhouse_id) references renthouse(r_house_id);
-- alter table contract add foreign key(c_shouse_id ) references sellhouse(s_house_id);
-- alter table contract add foreign key(house_id) references renthouse(r_house_id);
-- alter table contract add foreign key(house_id) references sellhouse(s_house_id);

/* foreign key for userstocontract*/

alter table userstocontracts add foreign key(c_id) references contract(c_id);

alter table userstocontracts add foreign key(user_id) references user(user_id);


alter table sellhouse drop foreign key sellhouse_ibfk_1;
alter table renthouse drop foreign key renthouse_ibfk_1;
alter table userstocontracts drop foreign key userstocontracts_ibfk_1;
alter table user drop foreign key user_ibfk_1;

insert into user values(123,'201512037@qq.com','123','15541166003','1');

insert into contract values(1,'无',1,1);
insert into sellhouse values(1,'嫩江小区','5','120','5',null,null,null,'产权',null);

drop table user;
drop table contract;
drop table renthouse;
drop table sellhouse;
drop table identity;
drop table userstocontracts;

select * from user;
select * from renthouse;
select * from sellhouse;
select * from identity;
select * from contract;
select * from userstocontracts;

