-- Last updated: 8/13/2026, 5:27:26 PM
# Write your MySQL query statement below
SELECT name
FROM Customer
WHERE referee_id != 2
   OR referee_id IS NULL;