-- Last updated: 8/1/2025, 10:34:13 PM
# Write your MySQL query statement below
SELECT ACTIVITY_DATE AS day,COUNT(DISTINCT USER_ID) AS active_users FROM ACTIVITY  WHERE ACTIVITY_DATE>="2019-06-28" AND ACTIVITY_DATE<="2019-07-27" GROUP BY DAY  ;