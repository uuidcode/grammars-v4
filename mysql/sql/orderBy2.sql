select * from
project p,
project_episode e
where e.project_id = p.project_id
order by p.reg_datetime desc, e.reg_datetime