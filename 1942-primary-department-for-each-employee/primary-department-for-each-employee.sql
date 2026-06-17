# Condition 1: Employees who belong to only one department
SELECT employee_id, department_id
FROM Employee
GROUP BY employee_id
HAVING COUNT(department_id) = 1

UNION

# Condition 2: Employees who belong to multiple departments and have a primary flag
SELECT employee_id, department_id
FROM Employee
WHERE primary_flag = 'Y';