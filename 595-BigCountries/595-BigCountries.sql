-- Last updated: 8/13/2026, 5:27:21 PM
# Write your MySQL query statement below
SELECT name, population, area
FROM World
WHERE area >= 3000000
   OR population >= 25000000;