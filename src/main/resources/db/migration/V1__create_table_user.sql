CREATE TABLE user(
    id int auto_increment primary key,
    user_name varchar(255) not null,
    name varchar(255) not null,
    email varchar (255) not null unique,
    surgery varchar(255) not null,
    birthdate varchar(255) not null,
    password varchar(255) not null,
    date_register timestamp not null
);