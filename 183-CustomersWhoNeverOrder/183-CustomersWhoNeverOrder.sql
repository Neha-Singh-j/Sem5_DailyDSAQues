-- Last updated: 8/1/2025, 10:38:59 PM
# Write your MySQL query statement below
-- select customers.name as customers from  customers left join orders
-- on customers.id=orders.customerId
-- where orders.id is null

select name as customers from customers where id not in (select customerid from orders)