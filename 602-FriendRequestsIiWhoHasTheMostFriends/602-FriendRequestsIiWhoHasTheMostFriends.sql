-- Last updated: 8/1/2025, 10:36:13 PM
# Write your MySQL query statement below

select requester_id as id,count(*) as num  from (
   select requester_id from requestaccepted
    union all
    select accepter_id from requestaccepted
) as t
group by id
order by count(*) desc
limit 1
