--SELECT * FROM country WHERE country LIKE 'A%a';
--SELECT * FROM country WHERE country LIKE '______%n';
--SELECT * FROM film WHERE title ILIKE '____t%';
SELECT title, length, rental_rate FROM film
WHERE title LIKE 'C%' AND length > 90 AND rental_rate = 2.99;