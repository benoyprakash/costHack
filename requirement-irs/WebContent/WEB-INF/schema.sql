create database requirement;
use requirement;
create table USER_DETAILS ( 
   USER_ID VARCHAR(10) NOT NULL,
   PASSWORD VARCHAR(10) NOT NULL,  
   ROLE VARCHAR(10) ,
   PRIMARY KEY ( USER_ID)
);

insert into USER_DETAILS (`USER_ID`, `PASSWORD`, `ROLE`) values ('bauser', 'bauser', 'BA');
insert into USER_DETAILS (`USER_ID`, `PASSWORD`, `ROLE`) values ('devuser', 'devuser', 'DEV');

select * from USER_DETAILS;