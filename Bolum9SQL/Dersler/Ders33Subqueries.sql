SELECT * FROM book WHERE page_number >
(SELECT page_number FROM book WHERE title = 'Corvette Summer');

SELECT title, page_number, (SELECT MAX(page_number) FROM book), ((SELECT MAX(page_number) FROM book) - page_number) AS differ FROM book 
WHERE page_number > 
(SELECT page_number FROM book WHERE title = 'Corvette Summer');