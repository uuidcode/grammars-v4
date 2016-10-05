select * from project
where exists ( select 1 from project_episode e where e.project_id = p.project_id )