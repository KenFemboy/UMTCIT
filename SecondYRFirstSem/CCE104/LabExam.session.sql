CREATE DATABASE LABEXAM;

CREATE TABLE regions(
    regionid INT primary key,
    region_name Varchar(25)
);

CREATE table countries(
    country_id CHAR(2) primary key,
    country_name Varchar(255),
    region_id INT,
    Foreign Key (region_id) references regions(region_id)
);

CREATE table locations(
    location_id INT PRIMARY KEY,
    street_address VARCHAR(225),
    postal_code Varchar(225),
    city VARCHAR(225),
    stateprovince VARCHAR(212),
    country_id CHAR(2),
    FOREIGN KEY (country_id) REFERENCES countries(country_id)
);

CREATE TABLE locations(
    location_id INT PRIMARY KEY,
    street_address VARCHAR(225),
    postal_code VARCHAR(212),
    city VARCHAR(225),
    stateprovince VARCHAR(212),
    country_id CHAR(2),
    FOREIGN KEY (country_id) REFERENCES countries(country_id)
);
CREATE TABLE departments(
    department_id INT PRIMARY KEY,
    dapartment_name VARCHAR(30),
    manager_id INT,
    location_id INT,
    FOREIGN KEY (location_id) REFERENCES locations(location_id)
);
    CREATE TABLE jobs(
    job_id VARCHAR (10) PRIMARY KEY,
    job_title VARCHAR(25),
    min_salary INT,
    max_salary INT
);
CREATE TABLE job_history(
    employee_id INT PRIMARY KEY,
    start_date DATE,
    end_date DATE,
    job_id VARCHAR(10),
    department_id INT,
    FOREIGN KEY (job_id) REFERENCES jobs(job_id),
    FOREIGN KEY (department_id) REFERENCES departments(department_id)
);
CREATE TABLE job_grades(
    grade_level VARCHAR(2),
    lowest_salary INT,
    highest_salary INT
);

CREATE TABLE employees(
    employee_id INT PRIMARY KEY,
    first_name VARCHAR(20),
    last_name VARCHAR(20),
    email VARCHAR(20),
    phonenumber VARCHAR(20),
    hire_date DATE,
    job_id VARCHAR(10),
    salary INT,
    commission_pct INT,
    manager_id INT,
    department_id INT,
    FOREIGN KEY (employee_id) REFERENCES job_history(employee_id),
    FOREIGN KEY (department_id) REFERENCES departments(department_id),
    FOREIGN KEY (job_id) REFERENCES jobs(job_id)
);
