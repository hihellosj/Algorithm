-- 코드를 입력하세요
WITH seoul_rest AS (
    SELECT rest_id
         , rest_name
         , food_type
         , favorites
         , address
    FROM   rest_info i
    WHERE  i.address LIKE '서울%'
           )
,
avg_score AS (
    SELECT   rest_id
  , ROUND(AVG(review_score), 2) AS score
    FROM     rest_review
    GROUP BY rest_id
             )
SELECT     r.rest_id
         , r.rest_name
         , r.food_type
         , r.favorites
         , r.address
         , a.score
FROM       seoul_rest r
INNER JOIN avg_score a
ON         r.rest_id = a.rest_id
ORDER BY   a.score DESC
         , r.favorites DESC;