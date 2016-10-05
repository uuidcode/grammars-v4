select * from project p,
project_episode e
where p.project_id = 1234
and e.project_id = p.project_id
