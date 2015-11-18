CREATE DATABASE IF NOT EXISTS instant;

USE instant;

DROP TABLE IF EXISTS instant.winappreg;

DROP TABLE IF EXISTS instant.winappcode;

CREATE TABLE IF NOT EXISTS instant.winappreg (
   id int(11) NOT NULL AUTO_INCREMENT,
   first_name varchar(45) DEFAULT NULL,
   last_name varchar(45) DEFAULT NULL,
   email varchar(45) NOT NULL,
   password varchar(45) NOT NULL,
   time_stamp timestamp,
   PRIMARY KEY (email),
   UNIQUE KEY id_UNIQUE (id)
 ) ENGINE=InnoDB AUTO_INCREMENT=31 DEFAULT CHARSET=utf8 COMMENT='		';
 
 CREATE TABLE IF NOT EXISTS instant.winappcode (
   id int(11) NOT NULL AUTO_INCREMENT,
   code varchar(45) NOT NULL,
   status char(1) NOT NULL,
   UNIQUE KEY id_UNIQUE (id),
   UNIQUE KEY code_UNIQUE (code)
 ) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8;
 
truncate table instant.winappcode;

insert into instant.winappcode (code,status) values('WINAPP1001',0);
insert into instant.winappcode (code,status) values('WINAPP1002',0);
insert into instant.winappcode (code,status) values('WINAPP1003',0);
insert into instant.winappcode (code,status) values('WINAPP1004',0);
insert into instant.winappcode (code,status) values('WINAPP1005',0);
insert into instant.winappcode (code,status) values('WINAPP1006',0);
insert into instant.winappcode (code,status) values('WINAPP1007',0);
insert into instant.winappcode (code,status) values('WINAPP1008',0);
insert into instant.winappcode (code,status) values('WINAPP1009',0);
insert into instant.winappcode (code,status) values('WINAPP1010',0);