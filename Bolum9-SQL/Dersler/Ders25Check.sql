SELECT * FROM users;

INSERT INTO users(username, email, age) VALUES ('gamer3', 'gamer3@gmail.com', -22);

SELECT * FROM users;

ALTER TABLE users ADD CHECK (age > 10);

DELETE FROM users WHERE id = 11;

ALTER TABLE users ADD CHECK (age > 10);

INSERT INTO users(username, email, age) VALUES ('gamer4', 'gamer4@gmail.com', -27);

INSERT INTO users(username, email, age) VALUES ('gamer4', 'gamer4@gmail.com', 34);

CREATE TABLE products (
    product_no integer,
    name text,
    price numeric CHECK (price > 0),
    discounted_price numeric CHECK (discounted_price > 0),
    CHECK (price > discounted_price)
);

INSERT INTO products(product_no, name, price, discounted_price) VALUES (1, 'test', -10, 12);
INSERT INTO products(product_no, name, price, discounted_price) VALUES (1, 'test', 10, 12);
INSERT INTO products(product_no, name, price, discounted_price) VALUES (1, 'test', 10, -12);
INSERT INTO products(product_no, name, price, discounted_price) VALUES (1, 'test', 10, 7);