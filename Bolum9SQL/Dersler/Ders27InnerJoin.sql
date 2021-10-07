DROP TABLE products;
DROP TABLE employee;
DROP TABLE test;
DROP TABLE test2;
DROP TABLE users;

SELECT * FROM book INNER JOIN author ON book.author_id = author.id;
SELECT title, first_name, last_name FROM book INNER JOIN author ON book.author_id = author.id;
SELECT book.title, author.first_name, author.last_name FROM book INNER JOIN author ON book.author_id = author.id;
SELECT book.title, author.first_name, author.last_name FROM author INNER JOIN book ON book.author_id = author.id;

SELECT ProductName, CategoryName FROM Products INNER JOIN Categories ON Products.CategoryID = Categories.CategoryID;