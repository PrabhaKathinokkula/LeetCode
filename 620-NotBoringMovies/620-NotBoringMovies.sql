-- Last updated: 8/13/2026, 5:27:08 PM
SELECT *
FROM Cinema
WHERE id % 2 = 1
  AND description <> 'boring'
ORDER BY rating DESC;