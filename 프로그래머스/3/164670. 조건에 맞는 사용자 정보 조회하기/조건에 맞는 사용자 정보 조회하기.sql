-- 코드를 입력하세요
select USER_ID,	NICKNAME, CITY||' '||STREET_ADDRESS1||' '||STREET_ADDRESS2	as 전체주소, 
SUBSTR(tlno,0,3)||'-'||SUBSTR(tlno,4,4)||'-'||SUBSTR(tlno,8) as 전화번호
from USED_GOODS_USER
where USER_ID in (
select WRITER_ID
from(
            select * 
            from(
                        select WRITER_ID, sum(cnt) as aaaa
                        from(
                        SELECT WRITER_ID, '1' as cnt
                        from USED_GOODS_BOARD
                            ) t
                        group by WRITER_ID
                )t3
                where aaaa >=3
    )t2
    )
order by user_id desc