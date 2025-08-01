-- Last updated: 8/1/2025, 10:32:30 PM
# Write your MySQL query statement below
SELECT teacher_id,COUNT(DISTINCT subject_id) AS cnt
FROM TEACHER
GROUP BY teacher_id ;