CREATE TABLE category (
    category_id BIGINT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(100)
);

CREATE TABLE users (
    user_id BIGINT AUTO_INCREMENT PRIMARY KEY,
    username VARCHAR(100),
    email VARCHAR(100),
    date_of_birth DATE,
    password VARCHAR(255)
);

CREATE TABLE serie (
    serie_id BIGINT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(100),
    category_id BIGINT,
    description TEXT,
    FOREIGN KEY (category_id) REFERENCES category(category_id)
);
