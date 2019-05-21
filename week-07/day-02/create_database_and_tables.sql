CREATE DATABASE if not exists todoDB;

USE todoDB;

CREATE TABLE users (
	userID int auto_increment primary key,
    name varchar(30) not null
);

CREATE TABLE tasks (
	taskID int auto_increment primary key,
    description varchar(255) not null,
    is_finished boolean not null,
    userID int,
    FOREIGN KEY (userID) REFERENCES users(userID)
);
