SELECT p.PRODUCT_ID, p.PRODUCT_NAME, sum(p.price * o.amount) as total
FROM food_order o
left joIN FOOD_PRODUCT p
  ON p.PRODUCT_ID = o.PRODUCT_ID
WHERE o.PRODUCE_DATE BETWEEN '2022-05-01' AND '2022-05-31'
group by p.PRODUCT_ID
ORDER BY total desc, p.PRODUCT_ID;
