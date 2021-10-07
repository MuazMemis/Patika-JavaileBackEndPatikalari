SELECT * FROM book;
SELECT * FROM author;

SELECT first_name, last_name FROM author 
WHERE id = 
(SELECT id FROM book 
WHERE title = 'Ivans xtc.');
 
SELECT first_name, last_name FROM author 
WHERE id = 
(SELECT id FROM book 
WHERE title = 'Ivans xtc.' OR title = 'Birdman of Alcatraz');

SELECT first_name, last_name FROM author 
WHERE id = ANY
(SELECT id FROM book 
WHERE title = 'Ivans xtc.' OR title = 'Simyacı');
 
SELECT first_name, last_name FROM author 
WHERE id = ALL
(SELECT id FROM book 
WHERE title = 'Ivans xtc.' OR title = 'Simyacı');
  
SELECT id, first_name, last_name FROM author 
WHERE id > ANY
(SELECT id FROM book 
WHERE title = 'Ivans xtc.' OR title = 'Simyacı');
   
SELECT id, first_name, last_name FROM author 
WHERE id > ALL
(SELECT id FROM book 
WHERE title = 'Ivans xtc.' OR title = 'Simyacı');