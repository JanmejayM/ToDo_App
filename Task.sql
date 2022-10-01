use Project_db;


CREATE TABLE Task(
id int auto_increment not null ,
brief varchar(25) not null,
details varchar(255) not null,

  PRIMARY KEY (id) 

);

insert into Task(brief,details)
values('to learn spring','to learn the basic spring core');

truncate table Task;

drop Table Task;