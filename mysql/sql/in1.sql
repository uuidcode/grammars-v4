select * from project_keyword
 where project_count >= 8
 and keyword in (
 select keyword1 from
     keyword_map m
     where m.object_type = 'PROJECT'
     and m.keyword_type = 'SEARCH'
)