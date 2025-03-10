DROP TABLE product IF EXISTS;

CREATE TABLE product
(
    id    INTEGER NOT NULL,
    name  VARCHAR(255),
    price INTEGER,
    PRIMARY KEY (id)
);

DROP TABLE promotion IF EXISTS;

CREATE TABLE promotion
(
    id             INTEGER NOT NULL,
    promotion_type VARCHAR(10),
    name           VARCHAR(255),
    discount_type  VARCHAR(15),
    discount_value INTEGER,
    use_started_at DATE,
    use_ended_at   DATE,
    PRIMARY KEY (id)
);

DROP TABLE promotion_products IF EXISTS;

CREATE TABLE promotion_products
(
    id           INTEGER NOT NULL,
    promotion_id INTEGER NOT NULL,
    product_id   INTEGER NOT NULL,
    PRIMARY KEY (id)
);

ALTER TABLE promotion_products
    ADD FOREIGN KEY (promotion_id) REFERENCES promotion (id);

ALTER TABLE promotion_products
    ADD FOREIGN KEY (product_id) REFERENCES product (id);


