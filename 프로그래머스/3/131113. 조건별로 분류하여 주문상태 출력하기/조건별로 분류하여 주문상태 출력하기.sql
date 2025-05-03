-- 코드를 입력하세요
SELECT order_id, product_id, TO_CHAR(out_date, 'YYYY-MM-DD'),
  CASE 
    WHEN out_date = to_date('2022-05-01', 'YYYY-MM-DD') THEN '출고완료'
    WHEN out_date > to_date('2022-05-01', 'YYYY-MM-DD') THEN '출고대기'
    WHEN out_date < to_date('2022-05-01', 'YYYY-MM-DD') THEN '출고완료'
    when out_date is null then  '출고미정'
  END AS 출고여부
FROM FOOD_ORDER
ORDER BY order_id;


