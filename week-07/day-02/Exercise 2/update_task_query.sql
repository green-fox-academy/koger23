# Update Gergely's "Build the DB" task to true
UPDATE tasks SET is_finished = true WHERE description = "Build the DB" AND userID = 3;
SELECT * FROM tasks;
