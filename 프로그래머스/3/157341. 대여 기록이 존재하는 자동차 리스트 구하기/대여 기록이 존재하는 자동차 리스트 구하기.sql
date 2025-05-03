-- 코드를 입력하세요
SELECT distinct(h.car_id)
from CAR_RENTAL_COMPANY_RENTAL_HISTORY h
left join CAR_RENTAL_COMPANY_CAR c
on h.car_id = c.car_id
where start_date >= to_date('2022-10-01','YYYY-MM-dd')
and car_type = '세단'
order by car_id desc
;