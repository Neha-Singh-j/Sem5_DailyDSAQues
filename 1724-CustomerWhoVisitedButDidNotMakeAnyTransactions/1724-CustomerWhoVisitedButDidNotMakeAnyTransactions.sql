-- Last updated: 8/1/2025, 10:33:29 PM
# Write your MySQL query statement below
select visits.customer_id,count(visits.visit_id) as count_no_trans from visits left join Transactions on visits.visit_id=Transactions.visit_id 
where Transactions.Transaction_id is null
group by visits.customer_id
order by visits.customer_id ;