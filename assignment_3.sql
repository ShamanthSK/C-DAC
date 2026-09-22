CREATE DATABASE school;

USE school;

CREATE TABLE students(
std_id INT PRIMARY KEY,
name VARCHAR(50) NOT NULL,
email VARCHAR(50) NOT NULL,
age INT NOT NULL,
course VARCHAR(50)
);

DESC students;

CREATE TABLE courses(
course_id INT PRIMARY KEY,
course_name VARCHAR(50),
duration VARCHAR(50),
fees DECIMAL(10,2)
);

DESC courses;

CREATE TABLE enrollment(
enroll_id INT PRIMARY KEY,
std_id INT,
course_id INT,
enroll_date DATE,
CONSTRAINT fk_std_id_enrollment__student FOREIGN KEY(std_id) REFERENCES students(std_id) ON DELETE CASCADE ON UPDATE CASCADE,
CONSTRAINT fk_course_id_enrollment__courses FOREIGN KEY(course_id) REFERENCES courses(course_id) ON DELETE CASCADE ON UPDATE CASCADE
);

DESC enrollment;

DROP TABLE enrollment;

ALTER TABLE students ADD COLUMN phone_number VARCHAR(12) NOT NULL;

ALTER TABLE courses MODIFY COLUMN fees DECIMAL(10,3) NOT NULL;

ALTER TABLE courses RENAME COLUMN course_name TO course_title;

INSERT INTO students (std_id,name,email,age,course,phone_number) VALUES
(1001,'Arya','arya@gmail.com',22,'DAC','964515482'),
(1002,'Shamanth','sk@gmail.com',25,'DAC','8965544215'),
(1003,'Sourabh','soub@gmail.com',24,'BDA','79632141521'),
(1004,'Kushal','kushal@gmail.com',30,'AI','636345874'),
(1005,'sakshi','sakshi@gmail.com',24,'BDA','694165115421'),
(1006,'Meera','meera@gmail.com',30,'WBL','54245546544'),
(1007,'Jahnavi','jaans@gmail.com',28,'HPC','964457814')
; 

INSERT INTO courses VALUES
(01,'DAC','6 MONTHS',117000),
(02,'BDA','6 MONTHS',123000),
(03,'AI','5 MONTHS',154000),
(04,'HPC','7 MONTHS',96000),
(05,'WBL','10 MONTHS',90000)
;

SELECT * FROM students;

SELECT * FROM courses;

UPDATE students
SET age = 17
WHERE std_id=1006;

 UPDATE students
SET age = 17
WHERE std_id=1004;

SET SQL_SAFE_UPDATES=0;

UPDATE courses
SET fees = fees+(fees*0.1);

SET SQL_SAFE_UPDATES=1;

DELETE FROM students WHERE age < 18;

TRUNCATE TABLE courses;

SHOW TABLES;