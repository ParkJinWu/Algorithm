-- 경제 카테고리에 속하는 도서들의 BOOK_ID,AUTHOR_NAME,PUBLISHED_DATE 출력
SELECT BOOK_ID,AUTHOR_NAME,DATE_FORMAT(PUBLISHED_DATE,"%Y-%m-%d")
from book join author
using(author_id)
where category = "경제"
order by 3;
