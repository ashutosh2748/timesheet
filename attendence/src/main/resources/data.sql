drop table if exists authorities;
drop table if exists users;

create table users(username varchar(255) not null primary key, password varchar(255) not null, enabled boolean not null);
insert into users(username,password,enabled) values('admin','admin',true);
insert into users(username,password,enabled) values('faculty','faculty',true);
insert into users(username,password,enabled) values('student','student',true);

create table authorities(username  varchar(255),authority  varchar(255), UNIQUE(username,authority), constraint fk_authorities_users foreign key(username) references users(username));
insert into authorities(username,authority) values('admin','ROLE_ADMIN');
insert into authorities(username,authority) values('faculty','ROLE_FACULTY');
insert into authorities(username,authority) values('student','ROLE_STUDENT');

