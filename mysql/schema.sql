CREATE DATABASE IF NOT EXISTS netflix_db;
USE netflix_db;

CREATE TABLE movies (
    id INT AUTO_INCREMENT PRIMARY KEY,
    title VARCHAR(255) NOT NULL,
    genre VARCHAR(100),
    rating DOUBLE,
    url VARCHAR(500)
);

INSERT INTO movies (title, genre, rating, url) VALUES 
('Stranger Things', 'Sci-Fi', 8.7, 'https://example.com'),
('The Witcher', 'Fantasy', 8.1, 'https://example.com');