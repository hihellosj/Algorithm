-- 코드를 입력하세요

-- select t.user_id, t.NICKNAME, t.totalprice 
-- from
-- (SELECT u.user_id, u.NICKNAME, sum(price) as totalprice
-- from USED_GOODS_BOARD b
-- left join USED_GOODS_USER u
-- on b.WRITER_ID = u.USER_ID
-- group by u.user_id
-- )t
-- where totalprice >= 700000
-- order by totalprice

select u.user_id, u.NICKNAME, total_sales
from(
select WRITER_ID, sum(price) as total_sales
from USED_GOODS_BOARD
where STATUS = 'DONE'
group by WRITER_ID
)t
left join USED_GOODS_USER u
on u.user_id = t.writer_id
where total_sales >= 700000
order by total_sales
