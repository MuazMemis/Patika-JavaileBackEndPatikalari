INSERT INTO users(username, email, age) VALUES ('tester2', 'tester2@gmail.com', 36);
	
SELECT * FROM users;

ALTER TABLE users ADD UNIQUE(email);