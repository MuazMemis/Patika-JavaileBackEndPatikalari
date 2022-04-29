SELECT MAX(rental_rate) FROM film;
SELECT MIN(rental_rate) FROM film;
SELECT AVG(length) Ortalama FROM film;
SELECT ROUND(AVG(length), 3) Ortalama FROM film;
SELECT SUM(rental_rate) FROM film;
SELECT MAX(length), MIN(length), SUM(replacement_cost) FROM film;
SELECT MAX(length) FROM film WHERE rental_rate = 0.99;
SELECT MAX(length) FROM film WHERE rental_rate IN (0.99,2.99);