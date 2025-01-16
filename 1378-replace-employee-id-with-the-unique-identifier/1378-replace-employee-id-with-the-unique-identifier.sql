# Write your MySQL query statement below
select  name, (select unique_id from EmployeeUNI e2 where e1.id=e2.id) as unique_id from Employees e1  ;