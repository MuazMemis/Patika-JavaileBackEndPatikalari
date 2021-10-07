(SELECT * FROM book ORDER BY page_number LIMIT 5)
INTERSECT (SELECT * FROM book ORDER BY title LIMIT 5);

(SELECT * FROM book ORDER BY page_number LIMIT 10)
INTERSECT (SELECT * FROM book ORDER BY title LIMIT 10);

(SELECT * FROM book ORDER BY page_number LIMIT 10)
UNION (SELECT * FROM book ORDER BY title LIMIT 10);

(SELECT * FROM book ORDER BY page_number LIMIT 10)
UNION ALL (SELECT * FROM book ORDER BY title LIMIT 10);

(SELECT * FROM book ORDER BY page_number LIMIT 5) 
EXCEPT (SELECT * FROM book ORDER BY title LIMIT 5); -- Birinci sorguda olan ikinci sorguda olmayan verileri getirir.