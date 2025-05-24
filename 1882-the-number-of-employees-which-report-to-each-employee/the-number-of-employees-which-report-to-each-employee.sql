# Write your MySQL query statement below
SELECT e2.reports_to as  employee_id,e1.name,COUNT(e2.reports_to) as reports_count,ROUND(AVG(e2.age)) as average_age
FROM Employees As e1
JOIN Employees As e2
ON e1.employee_id = e2.reports_to
group by e2.reports_to
order by e2.reports_to