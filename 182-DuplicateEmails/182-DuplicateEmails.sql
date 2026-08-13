-- Last updated: 8/13/2026, 5:27:53 PM
# Write your MySQL query statement below
SELECT email AS Email
FROM Person
GROUP BY email
HAVING COUNT(email) > 1;
