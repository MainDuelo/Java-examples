DROP TABLE game IF EXISTS;

CREATE TABLE game (
    id BIGINT IDENTITY NOT NULL PRIMARY KEY,
    name VARCHAR(20),
    developer VARCHAR(20),
    genre VARCHAR(10)
);