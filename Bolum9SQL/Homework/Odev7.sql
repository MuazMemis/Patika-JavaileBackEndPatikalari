SELECT rating FROM film GROUP BY rating;
SELECT replacement_cost, COUNT(film_id) FROM film GROUP BY replacement_cost HAVING COUNT(film_id) > 50;
SELECT store_id, COUNT(customer_id) FROM customer Group BY store_id;
SELECT country_id , COUNT(city) FROM city GROUP BY country_id ORDER BY COUNT(city) DESC LIMIT 1;