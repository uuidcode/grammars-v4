select * from category c
left join project_category_map m on m.category_id = c.category_id and m.category_id = c.category_id
where c.status = 'SERVICE'