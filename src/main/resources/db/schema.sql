create table if not exists USER (
	ID int not null primary key auto_increment,
	NAME varchar(100),
	CRT_TIME DATE,
	MOD_TIME DATE,
	STATUS varchar(1)
);