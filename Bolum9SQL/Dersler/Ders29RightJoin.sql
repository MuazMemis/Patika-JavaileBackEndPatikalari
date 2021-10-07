SELECT first_name, last_name, title FROM book RIGHT JOIN author ON author.id = book.author_id;
SELECT first_name, last_name, title FROM book RIGHT OUTER JOIN author ON author.id = book.author_id;