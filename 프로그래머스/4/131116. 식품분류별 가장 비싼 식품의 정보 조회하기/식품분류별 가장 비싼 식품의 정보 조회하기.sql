-- 코드를 입력하세요
SELECT
CATEGORY,price,PRODUCT_NAME
from FOOD_PRODUCT
where(category, price) in (
select category, max(price)
from FOOD_PRODUCT
group by category
)
and category in ('과자', '국', '김치', '식용유')
order by price desc

