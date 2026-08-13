-- Last updated: 8/13/2026, 5:27:18 PM
# Write your MySQL query statement below
SELECT class
FROM Courses
GROUP BY class
HAVING COUNT(student) >= 5;