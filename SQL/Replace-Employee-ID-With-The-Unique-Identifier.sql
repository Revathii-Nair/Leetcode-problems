1# Write your MySQL query statement below
2select EmployeeUNI.unique_id, Employees.name 
3from Employees left join EmployeeUNI 
4on Employees.id = EmployeeUNI.id
5
6