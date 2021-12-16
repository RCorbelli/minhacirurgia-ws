CREATE TABLE user(
    id int auto_increment primary key,
    user_name varchar(255) not null,
    name varchar(255) not null,
    surgery varchar(255) not null,
    location varchar(255) not null,
    birthdate DATE not null,
    password varchar(255) not null
);