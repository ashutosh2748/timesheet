drop table if exists authorities;
drop table if exists users;

create table users(username varchar(255) not null primary key, password varchar(255) not null, enabled boolean not null);
insert into users(username,password,enabled) values('admin','admin',true);
insert into users(username,password,enabled) values('user','user',true);

create table authorities(username  varchar(255),authority  varchar(255), UNIQUE(username,authority), constraint fk_authorities_users foreign key(username) references users(username));
insert into authorities(username,authority) values('admin','ROLE_ADMIN');
insert into authorities(username,authority) values('user','ROLE_USER');

insert into student(bar_code, first_name, last_name, student_id) values('0000233332312', 'Krishna', 'Bhat', 'CS100090');
