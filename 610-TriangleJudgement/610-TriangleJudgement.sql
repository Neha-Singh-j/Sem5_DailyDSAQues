-- Last updated: 8/1/2025, 10:36:07 PM
# Write your MySQL query statement below
select x,y,z,
case 
when x+y>z && x+z>y && y+z>x then 'Yes'
else 'No'
end as triangle
from Triangle;