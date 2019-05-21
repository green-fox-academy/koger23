# Delete "Build the universe" task
set sql_safe_updates = 0; # to allow the above code to run
DELETE FROM tasks WHERE description = "Build the universe" AND userID = 2;
SELECT * FROM tasks;
