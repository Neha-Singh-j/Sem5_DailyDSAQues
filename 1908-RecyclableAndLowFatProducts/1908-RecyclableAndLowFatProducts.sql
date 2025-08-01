-- Last updated: 8/1/2025, 10:33:10 PM
-- create table products;
-- insert 
-- (poduct_id int primary key,low_fats enum,recyclable enum)
-- values
-- (0,'Y','N'),(1,'Y','Y'),(2,'N','Y'),(3,'Y','Y'),(4,'N','N');

SELECT product_id FROM products
WHERE low_fats = 'Y' AND recyclable = 'Y';
