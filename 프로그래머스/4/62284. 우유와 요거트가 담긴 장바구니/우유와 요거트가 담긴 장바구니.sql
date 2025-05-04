

select cart_id
from(
select cart_id, sum(cnt2) as total
from(
SELECT distinct cart_id, name,'1' as cnt2
from CART_PRODUCTS
where name = 'Yogurt'
union all
SELECT distinct cart_id, name,'1' as cnt
from CART_PRODUCTS
where name = 'Milk'
    ) t
group by cart_id
) t2
where total > 1
order by cart_id


