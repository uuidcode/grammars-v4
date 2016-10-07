select e.* from project p,
project_episode e
where e.project_id = p.project_id
and e.project_id != p.project_id
and e.project_id > p.project_id
and e.project_id >= p.project_id
and e.project_id < p.project_id
and e.project_id <= p.project_id
and e.project_id is not null
and e.project_id is null