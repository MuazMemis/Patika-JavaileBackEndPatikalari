SELECT * FROM book ORDER BY title LIMIT 5;

(SELECT * FROM book ORDER BY page_number LIMIT 5)
UNION (SELECT * FROM book ORDER BY title LIMIT 5);

(SELECT * FROM book ORDER BY page_number LIMIT 5)
UNION ALL (SELECT * FROM book ORDER BY title LIMIT 5);

(SELECT id, email FROM author)
UNION (SELECT id, title FROM book);

(SELECT id, email, first_name FROM author) -- HATA! Her iki sorgu da aynı sütun sayısına sahip olmalıdır.
UNION (SELECT id, title FROM book);

(SELECT id, email FROM author)
UNION (SELECT id, title FROM book);

(SELECT id, email FROM author)
UNION (SELECT id, page_number FROM book); -- HATA:  UNION tipleri character varying ve integer bir araya gelemez