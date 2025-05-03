-- 코드를 입력하세요
SELECT b.category, SUM(a.sales) AS total_sales
FROM book_sales a
LEFT JOIN book b ON a.book_id = b.book_id
where sales_date >= to_date('2022-01-01', 'YYYY-MM-DD')
and sales_date <= to_date('2022-01-31', 'YYYY-MM-DD')
GROUP BY b.category
ORDER BY b.category;