CREATE TABLE book (
	id SERIAL PRIMARY KEY,
	title VARCHAR(100) NOT NULL,
	page_number INTEGER NOT NULL,
	author_id INTEGER REFERENCES author (id)
);

SELECT * FROM book;

insert into book (id, title, page_number, author_id) values (1, 'Keoma', 169, 20);
insert into book (id, title, page_number, author_id) values (2, 'Corvette Summer', 200, 17);
insert into book (id, title, page_number, author_id) values (3, 'Captain America: The Winter Soldier', 332, 5);
insert into book (id, title, page_number, author_id) values (4, 'Ivans xtc.', 331, 9);
insert into book (id, title, page_number, author_id) values (5, 'Hotel', 343, 5);
insert into book (id, title, page_number, author_id) values (6, 'Temp, The', 248, 12);
insert into book (id, title, page_number, author_id) values (7, 'Pretty Sweet', 248, 17);
insert into book (id, title, page_number, author_id) values (8, 'Birdman of Alcatraz', 336, 13);
insert into book (id, title, page_number, author_id) values (9, 'Little Giant, The', 269, 9);
insert into book (id, title, page_number, author_id) values (10, 'Where the Wild Things Are', 222, 14);

SELECT * FROM book WHERE author_id = 20;

SELECT * FROM book JOIN author ON author.id = book.author_id;