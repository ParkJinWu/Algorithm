-- 코드를 입력하세요
SELECT F.flavor
from  FIRST_HALF F, ICECREAM_INFO I
where I.flavor = F.flavor
and I.INGREDIENT_TYPE = "fruit_based"
and F.total_order > 3000
order by F.TOTAL_ORDER DESC;