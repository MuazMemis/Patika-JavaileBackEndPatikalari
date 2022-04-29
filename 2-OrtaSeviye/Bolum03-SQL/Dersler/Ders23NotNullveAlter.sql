VALUES
	('gamer@gmail.com', 35);

ALTER TABLE users ALTER COLUMN username SET NOT NULL;

DELETE FROM users WHERE username IS NULL; -- NULL için "=" yerine "IS" kullanılır.

SELECT * FROM users;

INSERT INTO users(email, age)
VALUES
	('gamer2@gmail.com', 36);


INSERT INTO users(username, email, age)
VALUES
	('', 'gamer2@gmail.com', 36);