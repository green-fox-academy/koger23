CREATE DATABASE if not exists todoDB;

USE todoDB;

CREATE TABLE users (
	userID int auto_increment primary key,
    name varchar(30) not null
);

SHOW TABLES;
SELECT * FROM users;

INSERT INTO users VALUES (null, "Mr.Green");
INSERT INTO users 
	VALUES (null, "Mr.Green"),
			(null, "Gergely");
SELECT * FROM users;

CREATE TABLE tasks (
	taskID int auto_increment primary key,
    description varchar(255) not null,
    is_finished boolean not null,
    userID int,
    FOREIGN KEY (userID) REFERENCES users(userID)
);

SHOW TABLES;
SELECT * FROM tasks;
INSERT INTO tasks VALUES (null, "Clear the DataBase", false, 1);
INSERT INTO tasks 
	VALUES (null, "Build the DB", false, 3),
			(null, "Build the DB", false, 2),
			(null, "Build a house", true, 3),
			(null, "Buy a car", true, 3),
			(null, "Build the universe", false, 2);
SELECT * FROM tasks;

# Update Gergely's "Build the DB" task to true
UPDATE tasks SET is_finished = true WHERE description = "Build the DB" AND userID = 3;
SELECT * FROM tasks;

# Delete "Build the universe" task
set sql_safe_updates = 0; # to allow the above code to run
DELETE FROM tasks WHERE description = "Build the universe" AND userID = 2;
SELECT * FROM tasks;