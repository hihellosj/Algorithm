-- 코드를 입력하세요
select t.NAME, t.DATETIME from(
SELECT i.NAME, i.DATETIME, rank() over (order by i.DATETIME) as rank
from ANIMAL_INS i
left join ANIMAL_OUTS o
on i.ANIMAL_ID = o.ANIMAL_ID
where o.ANIMAL_ID is null)t
where rank <= 3;