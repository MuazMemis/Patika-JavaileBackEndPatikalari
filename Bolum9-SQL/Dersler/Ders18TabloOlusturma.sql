CREATE TABLE author (
	id SERIAL PRIMARY KEY,
	first_name VARCHAR(50) NOT NULL,
	last_name VARCHAR(50) NOT NULL,
	email VARCHAR(100) NOT NULL,
	birthday DATE
);

SELECT * FROM author;

INSERT INTO author (first_name, last_name, email, birthday)
VALUES 
	('Haruki', 'Murakami', 'haruki@gmail.com','1948-11-07'),
	('Haruki2', 'Murakami2', 'haruki2@gmail.com','1942-11-07'),
	('Haruki3', 'Murakami3', 'haruki3@gmail.com','1935-11-07'),
	('Haruki4', 'Murakami4', 'haruki4@gmail.com','1962-11-07'),
	('Haruki5', 'Murakami5', 'haruki5@gmail.com','1957-11-07');
	
SELECT * FROM author;

CREATE TABLE author2 (LIKE author);

SELECT * FROM author2;

INSERT INTO author2
SELECT * FROM author
WHERE first_name = 'Haruki3';

SELECT * FROM author2;

CREATE TABLE author3 AS
SELECT * FROM author;

SELECT * FROM author3;

DROP TABLE author4;
DROP TABLE IF EXISTS author4;

DROP TABLE author3;
DROP TABLE author2;