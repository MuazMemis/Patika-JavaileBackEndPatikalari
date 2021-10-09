```sql - cmd
psql -U postgres -- Şifre gir.
```

```
help
```

```
\h SQL komutları hakkında yardım için
\? psql dahili komutlarının yardımı için
\g ya da noktalı virgül:  sorguyu çalıştırmak için
\q çıkmak için
```

```sql - cmd
\list or \l -- Veritabanlarını listeler.
```

```sql - cmd
\connect dvdrental -- Veritabanına bağlanır.
\c dvdrental -- Veritabanına bağlanır.
```

```sql - cmd
\dt -- Tabloları listeler.
```

```sql - cmd
\d actor -- Tablonun detaylarını gösterir.
```

```sql
SELECT * FROM actor;
```

```sql
SELECT * FROM actor WHERE first_name = 'Penelope';
```

```sql
SELECT * FROM actor
WHERE first_name = 'Penelope'
; -- Enter'a bas.
```

```sql
SELECT * FROM actor
WHERE first_name LIKE 'A%';
```

```sql
SELECT COUNT(*) FROM actor
WHERE first_name LIKE 'A%' AND last_name LIKE 'G%';
```

```sql
SELECT * FROM film
WHERE (length BETWEEN 100 AND 140) AND (rental_rate IN (0.99, 4.99));
```

```sql
-- İsminde en az 2 tane olsun
-- 100 dk dan uzun olsun
-- replacement_cost 15 den büyük, 25 den küçük olsun
-- rental_rate 2.99
```

```sql
SELECT * FROM film
WHERE (title ILIKE '%a%a%') AND (length > 100) AND (replacement_cost > 15 AND replacement_cost < 25) AND rental_rate = 2.99;
```

```sql
-- T ile başlayan filmlerin
-- kaç farklı dakikaya  sahip uzunlukları vardır.
```

```sql
SELECT COUNT(DISTINCT length) FROM film
WHERE title LIKE 'T%'; -- 37 satır
```

```sql
SELECT COUNT(*) FROM film
WHERE title LIKE 'T%'; -- 46 satır
```

```sql
--BETWEEN 10 AND 20 sorgu parçasında bulunan 10 ve 20  değerleri için hangisi söylenebilir?
-- İkiside sonuç verisine dahildir.
```
