-- Last updated: 8/1/2025, 10:36:09 PM
# Write your MySQL query statement below
select id,
case
 when p_id is null then 'Root'
 when id not in(select p_id  from tree where p_id is not null)then 'Leaf'
 else 'Inner'
 end as type
 from tree;