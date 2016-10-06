select project_type, support_status, count(*)
from project
where project_id > 0
group by project_type, support_status
order by project_type desc, support_status
