SELECT employees.lastname, employees.department_id, departments.department_name 
FROM EMPLOYEES, departments where employees.department_id=departments.department_id;

