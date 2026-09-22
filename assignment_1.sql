CREATE DATABASE emp_db;
USE emp_db;

CREATE TABLE employees(
emp_id INT PRIMARY KEY AUTO_INCREMENT,
first_name VARCHAR(50) NOT NULL,
last_name VARCHAR(50) NOT NULL,
email VARCHAR(100) UNIQUE NOT NULL,
phone VARCHAR(15) NULL,
hire_date DATE,
salary DECIMAL(10,2)NOT NULL,
department VARCHAR(50)NOT NULL
);

INSERT INTO employees (first_name, last_name, email, phone, hire_date, salary, department) VALUES 
	('Sham','Sk','Ssk@gmail.com','1234567899','2026-03-20',65000,'IT'),
    ('Arya','R','arya@gmai.com','2341235431','2026-02-12',65000,'SDE'),
    ('Rishi','reddy','reddy@gmail.com','1234554599','2025-11-20',75000,'AI'),
    ('Maya','Sena','maya@gmai.com','23412355541','2021-01-12',55000,'HR'),
    ('Rithi','mandela','mandela@gmail.com','965116899','2021-12-20',45000,'IT'),
    ('Mani','Ratnam','mani@gmai.com','8954135841','2024-05-05',35000,'Data Analyst');

DESC employees;

SELECT * FROM employees;

SELECT * FROM employees WHERE salary > 50000;

SELECT * FROM employees WHERE YEAR(hire_date) > 2022 AND MONTH(hire_date) > 01 AND DAY(hire_date)>01;

SELECT * FROM employees WHERE department='IT';

SELECT COUNT(*) AS total_employees FROM employees; 

UPDATE employees
SET salary=salary+(salary*0.1)
WHERE emp_id=3;

DELETE  FROM employees WHERE emp_id=5;