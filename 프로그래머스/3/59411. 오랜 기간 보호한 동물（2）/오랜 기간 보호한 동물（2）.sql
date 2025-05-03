
-- select t2.ANIMAL_ID, t2.name
-- from(
-- select t.ANIMAL_ID,t.name, rank() over (order by t.aaa desc) as rank
-- from(
-- SELECT o.ANIMAL_ID, o.name, i.datetime, o.datetime, (o.datetime-i.datetime) as aaa
-- from ANIMAL_OUTS o
-- left join ANIMAL_INS i
-- on i.ANIMAL_ID = o.ANIMAL_ID
-- where i.datetime is not null
--     )t
--     )t2
--     where rank <=2;
    
    
-- select t.ANIMAL_ID,t.name, rank() over (order by aaa desc) as rank
-- from(
-- SELECT o.ANIMAL_ID, o.name, i.datetime, o.datetime, (o.datetime-i.datetime) as aaa
-- from ANIMAL_OUTS o
-- left join ANIMAL_INS i
-- on i.ANIMAL_ID = o.ANIMAL_ID
--     )t
   select t2.animal_id, t2.name from(select t.animal_id, t.name, t.aaa , rank () over (order by aaa desc) as rank from(  
    SELECT o.ANIMAL_ID, o.name, i.datetime, o.datetime, (o.datetime-i.datetime) as aaa
from ANIMAL_OUTS o
left join ANIMAL_INS i
on i.ANIMAL_ID = o.ANIMAL_ID
where i.datetime is not null
order by aaa desc)t)t2
where rank <= 2;



