--SELECT * FROM actor Where first_name = 'Penelope';
--SELECT first_name, last_name FROM actor Where first_name = 'Penelope' AND last_name = 'Monroe';
--SELECT first_name, last_name FROM actor Where first_name = 'Penelope' OR first_name = 'Bob';
--SELECT film_id, rental_rate, length FROM film Where rental_rate = 4.99 AND length > 90;
--SELECT film_id, rental_rate FROM film Where rental_rate = 4.99 OR rental_rate = 2.99;
--SELECT film_id, rental_rate, rental_duration FROM film Where rental_rate = 4.99 AND rental_duration = 3;
--SELECT film_id, rental_rate, rental_duration, replacement_cost FROM film Where rental_rate = 4.99 AND rental_duration = 3 AND replacement_cost > 20;
--SELECT film_id, replacement_cost FROM film Where replacement_cost > 17 AND replacement_cost < 20;
--SELECT film_id, replacement_cost FROM film Where replacement_cost > 25 OR replacement_cost < 16;
--SELECT film_id, rental_rate, replacement_cost FROM film Where NOT (rental_rate = 4.99 AND replacement_cost = 20.99); -- İkisi beraber eşit olmayan sonuçları getirir.
--SELECT * FROM film Where NOT length > 110;
--SELECT * FROM actor Where first_name = 'Penelope' AND last_name = 'Monroe' OR first_name = 'Joe';
SELECT * FROM actor 
Where first_name = 'Penelope' AND last_name = 'Monroe' AND last_name = 'Swankx' OR first_name = 'Joe';