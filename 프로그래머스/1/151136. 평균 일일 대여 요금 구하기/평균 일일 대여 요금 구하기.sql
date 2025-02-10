-- 코드를 입력하세요
select ROUND(AVG(daily_fee),0) as AVERAGE_FEE
from CAR_RENTAL_COMPANY_CAR
where CAR_TYPE = "SUV";