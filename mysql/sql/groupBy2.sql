select support_status, count(*) from project
group by support_status
order by count(*)