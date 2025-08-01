-- Last updated: 8/1/2025, 10:36:14 PM
# Write your MySQL query statement below
SELECT CLASS FROM COURSES GROUP BY CLASS HAVING COUNT(STUDENT)>=5 ;