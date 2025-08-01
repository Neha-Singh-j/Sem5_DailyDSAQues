-- Last updated: 8/1/2025, 10:34:21 PM
# Write your MySQL query statement below
SELECT DISTINCT customer_id FROM Customer GROUP BY customer_id
HAVING COUNT(DISTINCT product_key) = (SELECT COUNT(DISTINCT product_key) FROM Product)
ORDER BY customer_id;
