CREATE TABLE screen_access(
    id int auto_increment primary key,
    screen_id int not null,
    user_id int not null,
    access_time DATETIME not null,
    FOREIGN KEY (user_id) REFERENCES user(id)
);