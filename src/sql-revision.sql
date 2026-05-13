-- 1. Get all employees with salary above 50000
SELECT *
FROM employees
WHERE salary > 50000;


-- 2. Get count of employees in each department
SELECT department, COUNT(*)
FROM employees
GROUP BY department;


-- 3. Get top 3 highest paid employees
SELECT *
FROM employees
ORDER BY salary DESC
    LIMIT 3;


-- 4. Join employees and departments table to show employee name with department name
SELECT e.name AS employee_name,
       d.name AS department_name
FROM employees e
         JOIN department d
              ON e.empid = d.empid;


-- 5. Get all employees hired in the last 30 days
SELECT *
FROM employees
WHERE hire_date >= CURRENT_DATE - INTERVAL 30 DAY;