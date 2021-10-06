SELECT * FROM author;

UPDATE author
SET first_name = 'Mehmet2',
	last_name = 'Yozgatli2',
	email = 'mehmet2@gmail.com',
	birthday = '1980-01-01'
WHERE id = 10;
	
UPDATE author
SET first_name = 'XXX',
	last_name = 'YYY',
	email = 'XXXYYY@gmail.com',
	birthday = '1980-01-01'
WHERE first_name LIKE 'V%';
	
UPDATE author
SET last_name = 'UPDATE'
WHERE first_name = 'Dale'
RETURNING *;

DELETE FROM author
WHERE id = 8;

DELETE FROM author
WHERE id > 20
RETURNING *;