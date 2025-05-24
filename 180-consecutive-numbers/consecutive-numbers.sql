# Write your MySQL query statement below
SELECT DISTINCT l1.num as ConsecutiveNums 
FROM Logs as l1
JOIN Logs as l2
JOin Logs as l3
WHERE l1.num = l2.num AND l2.num = l3.num AND l1.id = l2.id-1 AND l2.id = l3.id-1 