-- 코드를 입력하세요
select FOOD_TYPE,	REST_ID,	REST_NAME,	FAVORITES
from (
SELECT FOOD_TYPE,	REST_ID,	REST_NAME,	FAVORITES, rank() over (partition by FOOD_TYPE order by FAVORITES desc) rnk
from REST_INFO
    ) a
where rnk = 1
order by FOOD_TYPE desc