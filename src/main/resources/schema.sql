
create table product(
id bigint auto_increment primary key, 
name varchar(255) not null,
price double not null,
score smallint not null,
image varchar(255) not null);


create table address(
id bigint auto_increment primary key, 
address varchar(255) not null,
number integer,
complement varchar(255),
city varchar(50));


create table checkout(
id bigint auto_increment primary key, 
name varchar(255) not null,
cpf varchar(255) not null,
cardNumber varchar(50) not null,
address_id bigint not null, 
foreign key (address_id) references address(id));