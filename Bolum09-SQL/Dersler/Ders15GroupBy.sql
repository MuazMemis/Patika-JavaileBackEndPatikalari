--SELECT rental_rate, MAX(length) FROM film GROUP BY rental_rate;
--SELECT rental_rate,COUNT(*) FROM film GROUP BY rental_rate;
--SELECT rental_rate, title, COUNT(*) FROM film GROUP BY rental_rate, title;
--SELECT rating, COUNT(*) FROM film GROUP BY rating;
--SELECT replacement_cost, rental_rate, MIN(length) FROM film GROUP BY replacement_cost, rental_rate ORDER BY replacement_cost, rental_rate DESC;
--SELECT COUNT(DISTINCT replacement_cost) FROM film;
SELECT replacement_cost, rental_rate, MIN(length) FROM film 
GROUP BY replacement_cost, rental_rate 
ORDER BY MIN(length) LIMIT 5;