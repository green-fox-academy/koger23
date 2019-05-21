SHOW TABLES;

SELECT * FROM users;
INSERT INTO users VALUES (null, "Mr.Green");
INSERT INTO users 
	VALUES (null, "Mr.Green"),
			(null, "Gergely");
SELECT * FROM users;

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
