-- Last updated: 8/13/2026, 5:26:43 PM
# Write your MySQL query statement below
SELECT
    player_id,
    MIN(event_date) AS first_login
FROM Activity
GROUP BY player_id;