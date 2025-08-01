-- Last updated: 8/1/2025, 10:34:09 PM
# Write your MySQL query statement below
select distinct author_id as id from Views
where viewer_id=author_id 
Order By viewer_id ASC;