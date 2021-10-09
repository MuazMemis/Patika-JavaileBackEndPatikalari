SELECT COUNT(*) FROM film WHERE
length > (SELECT AVG(length) FROM film);

SELECT COUNT(*) FROM film WHERE
rental_rate = (SELECT MAX(rental_rate) FROM film);

SELECT COUNT(*) FROM film WHERE
(rental_rate = (SELECT MIN(rental_rate) FROM film)) AND (replacement_cost = (SELECT MIN(replacement_cost) FROM film));

SELECT * FROM payment; 

SELECT customer_id, COUNT(amount) FROM payment
GROUP BY customer_id HAVING customer_id > ALL ( Select COUNT(amount) FROM payment GROUP BY customer_id);