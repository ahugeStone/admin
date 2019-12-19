drop table USER;
create table if not exists USER (
	id int not null primary key auto_increment,
	loginName varchar(100),
	name varchar(100),
	introduction varchar(100),
	avatar varchar(500),
	crtTime DATE,
	modTime DATE,
	status varchar(1)
);