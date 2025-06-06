SELECT 
    C.CAR_ID,
    C.CAR_TYPE,
    ROUND(C.DAILY_FEE * (1 - P.DISCOUNT_RATE / 100) * 30) AS FEE
FROM 
    CAR_RENTAL_COMPANY_CAR C
JOIN 
    CAR_RENTAL_COMPANY_DISCOUNT_PLAN P 
    ON C.CAR_TYPE = P.CAR_TYPE AND P.DURATION_TYPE = '30일 이상'
LEFT JOIN 
    CAR_RENTAL_COMPANY_RENTAL_HISTORY H 
    ON C.CAR_ID = H.CAR_ID 
    AND H.START_DATE <= DATE '2022-11-30' 
    AND H.END_DATE >= DATE '2022-11-01'
WHERE 
    C.CAR_TYPE IN ('세단', 'SUV')
    AND H.CAR_ID IS NULL
    AND ROUND(C.DAILY_FEE * (1 - P.DISCOUNT_RATE / 100) * 30) BETWEEN 500000 AND 1999999
ORDER BY 
    FEE DESC,
    C.CAR_TYPE ASC,
    C.CAR_ID DESC;
