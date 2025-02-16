select MEMBER_ID,MEMBER_NAME,GENDER,DATE_FORMAT(DATE_OF_BIRTH, "%Y-%m-%d") AS DATE_OF_BIRTH
from MEMBER_PROFILE
where DATE_FORMAT(DATE_OF_BIRTH,"%m") = "03"
and TLNO IS NOT NULL
and GENDER = 'W'
order by MEMBER_ID ASC;