CREATE DATABASE Book_db;
USE Book_db;

CREATE TABLE Books(
name VARCHAR(50) NOT NULL,
author VARCHAR(50) NOT NULL,
price DECIMAL(10,2) NOT NULL,
writer VARCHAR(50) NOT NULL
);

DESC Books;

ALTER TABLE Books ADD COLUMN published_year YEAR;

ALTER TABLE Books MODIFY COLUMN price DECIMAL(10,3) DEFAULT 150;

ALTER TABLE Books CHANGE COLUMN writer publisher VARCHAR(60);

ALTER TABLE Books DROP COLUMN published_year;

-- DROP TABLE Books; 

INSERT INTO Books VALUES 
('Atomic habits','Nelson',800,'Nelson'),
('Kanadavalu','Shamanth',450,'Shamanth'),
('Heli hogu karana','Ravi Beligeri',500,'Ravi Beligeri'),
('Ramayana','Valmiki',520,'Valmiki'),
('Kaggattalu','D R Bendre',330,'D R Bendre')
;

SELECT * FROM Books;

SET SQL_SAFE_UPDATES=0;

UPDATE Books
SET price=900
WHERE name='Kaggattalu';

SET SQL_SAFE_UPDATES=1;

DELETE FROM Books WHERE name='Atomic habits';

TRUNCATE TABLE Books;
