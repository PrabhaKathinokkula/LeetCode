-- Last updated: 8/13/2026, 5:26:54 PM
# Write your MySQL query statement below
SELECT
    actor_id,
    director_id
FROM ActorDirector
GROUP BY actor_id, director_id
HAVING COUNT(*) >= 3;
