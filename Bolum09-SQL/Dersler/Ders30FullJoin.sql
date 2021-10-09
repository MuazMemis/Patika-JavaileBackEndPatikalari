SELECT first_name, last_name, title FROM book FULL JOIN author ON author.id = book.author_id;
SELECT * FROM book FULL JOIN author ON author.id = book.author_id;
SELECT * FROM author FULL JOIN book ON author.id = book.author_id;
SELECT * FROM author FULL OUTER JOIN book ON author.id = book.author_id;

SELECT * FROM author 
FULL JOIN book  ON author.id = book.author_id
WHERE (book.id IS NOT NULL AND author.id IS NOT NULL);

SELECT * FROM book 
INNER JOIN author ON author.id = book.author_id;

SELECT * FROM author 
FULL JOIN book  ON author.id = book.author_id
WHERE (book.id IS NULL OR author.id IS NULL);