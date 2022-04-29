SELECT first_name, last_name, title FROM author LEFT JOIN book ON book.author_id = author.id;
SELECT first_name, last_name, title FROM book LEFT JOIN author ON book.author_id = author.id;

INSERT INTO book (title, page_number, author_id) VALUES ('Simyacı', 150, 21);

ALTER TABLE book DROP CONSTRAINT book_author_id_fkey;

INSERT INTO book (title, page_number, author_id) VALUES ('Simyacı', 150, 21);

SELECT first_name, last_name, title FROM book LEFT JOIN author ON book.author_id = author.id;

SELECT first_name, last_name, title FROM book
LEFT JOIN author ON book.author_id = author.id
WHERE author.id
IS NOT NULL
ORDER BY title;