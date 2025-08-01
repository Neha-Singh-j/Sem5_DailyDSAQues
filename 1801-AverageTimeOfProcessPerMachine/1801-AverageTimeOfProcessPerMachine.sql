-- Last updated: 8/1/2025, 10:33:23 PM

select a.machine_id,  round(avg(ed-st),3) as processing_time from
(select machine_id,process_id,
sum(case when activity_type='start' then timestamp end) as st,
sum(case when activity_type='end' then timestamp end) as ed
from activity
group by machine_id,process_id) as a
group by a.machine_id;