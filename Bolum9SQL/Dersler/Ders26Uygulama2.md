```sql - cmd
psql -U postgres -- Şifre gir.
```

```sql - cmd
\list or \l -- Veritabanlarını listeler.
```

```sql
CREATE DATABASE testdb;
```

```sql - cmd
psql -h localhost -p 5432 -U postgres testdb -- Direk testdb veritabanına bağlanır.
```

```sql
CREATE TABLE users (
    id SERIAL PRIMARY KEY,
    username VARCHAR(50) NOT NULL,
     birthday DATE
);
```

```sql
\dt -- Tabloları listeler
\d+ -- Tabloları listeler detaylı listeler
\d+ users -- Sütun adları ve veri tiplerini gösterir.
```

```sql
insert into users (id, username, birthday) values (1, 'Briant', '2018-08-24');
insert into users (id, username, birthday) values (2, 'Ediva', '2006-10-03');
insert into users (id, username, birthday) values (3, 'Shel', '2002-08-21');
insert into users (id, username, birthday) values (4, 'Muffin', '2009-08-02');
insert into users (id, username, birthday) values (5, 'Herc', '2016-05-25');
insert into users (id, username, birthday) values (6, 'Evanne', '2020-09-06');
insert into users (id, username, birthday) values (7, 'Norina', '2016-10-21');
insert into users (id, username, birthday) values (8, 'Waiter', '2011-04-13');
insert into users (id, username, birthday) values (9, 'Alonso', null);
insert into users (id, username, birthday) values (10, 'Kilian', null);
insert into users (id, username, birthday) values (11, 'Lanie', '2004-09-26');
insert into users (id, username, birthday) values (12, 'Niall', null);
insert into users (id, username, birthday) values (13, 'Tremaine', '2011-04-15');
insert into users (id, username, birthday) values (14, 'Grete', '2001-12-09');
insert into users (id, username, birthday) values (15, 'Hubie', '2021-08-02');
insert into users (id, username, birthday) values (16, 'Bat', null);
insert into users (id, username, birthday) values (17, 'Neron', '2013-09-11');
insert into users (id, username, birthday) values (18, 'Isidro', '2000-12-01');
insert into users (id, username, birthday) values (19, 'Standford', null);
insert into users (id, username, birthday) values (20, 'Ashlan', '2007-09-16');
insert into users (id, username, birthday) values (21, 'Appolonia', '2002-09-01');
insert into users (id, username, birthday) values (22, 'Giffer', '2012-08-12');
insert into users (id, username, birthday) values (23, 'Sherill', '2008-11-06');
insert into users (id, username, birthday) values (24, 'Celestia', '2007-03-03');
insert into users (id, username, birthday) values (25, 'Clemmie', '2002-10-13');
```

```sql
ALTER TABLE users RENAME COLUMN birtday TO birthday;
```

```sql
insert into users (id, username, birthday) values (25, 'Clemmie', '2002-10-13');
```

```sql
SELECT * FROM users WHERE username = 'Clemmie';
```

```sql
ALTER TABLE users ADD CONSTRAINT unique_username UNIQUE (username);
```

```sql
UPDATE users SET username ='Ahmet' WHERE id =25;
```

```sql
ALTER TABLE users ADD CONSTRAINT unique_username UNIQUE (username);
```

```
\d+ users
```

```sql
insert into users (id, username, birthday) values (27, 'Clemmie', '2002-10-13');
```
