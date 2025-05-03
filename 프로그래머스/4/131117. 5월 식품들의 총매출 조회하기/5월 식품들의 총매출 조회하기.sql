-- 코드를 입력하세요 18



SELECT o.product_id, (select product_name from FOOD_PRODUCT where product_id = o.product_id),sum(p.price * o.amount) as total
from FOOD_ORDER o
left join FOOD_PRODUCT p
on p.PRODUCT_ID = o.PRODUCT_ID
where price is not null and to_char(PRODUCE_DATE,'yyyy-mm') = '2022-05'
group by o.PRODUCT_ID
order by total desc, o.product_id

