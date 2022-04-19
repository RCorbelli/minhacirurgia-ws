CREATE TABLE surgery_time(
    id int auto_increment primary key,
    user_id int not null,
    surgery_time varchar(10) not null,
    FOREIGN KEY (user_id) REFERENCES user(id)
);