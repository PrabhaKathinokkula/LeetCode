-- Last updated: 8/13/2026, 5:28:00 PM
# Write your MySQL query statement below
SELECT
    p.firstName,
    p.lastName,
    a.city,
    a.state
FROM Person p
LEFT JOIN Address a
ON p.personId = a.personId;