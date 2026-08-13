-- Last updated: 8/13/2026, 5:26:53 PM
SELECT
    p.product_name,
    s.year,
    s.price
FROM Sales s
JOIN Product p
ON s.product_id = p.product_id;