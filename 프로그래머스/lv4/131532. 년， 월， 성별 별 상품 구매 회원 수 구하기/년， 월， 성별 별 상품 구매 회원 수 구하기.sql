SELECT YEAR(SALES_DATE) , MONTH(SALES_DATE), GENDER,COUNT(DISTINCT A.USER_ID)
FROM ONLINE_SALE A
INNER JOIN USER_INFO B
ON A.USER_ID = B.USER_ID
WHERE GENDER IS NOT NULL
GROUP BY YEAR(SALES_DATE), MONTH(SALES_DATE), GENDER
ORDER BY YEAR(SALES_DATE), MONTH(SALES_DATE), GENDER