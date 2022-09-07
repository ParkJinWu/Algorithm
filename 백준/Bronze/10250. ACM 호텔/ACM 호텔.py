#BOJ - 10250 ACM 호텔
# t = 테스트 케이스
# h = 호텔의 층 수 , w = 각 층의 방 수 , n = 몇번 째 손님

t = int(input())

for _ in range(t):
    h,w,n = map(int,input().split())

    floor =n % h
    room_number = n // h + 1

    #예외처리(손님의 숫자와 호텔의 층수가 같을 때 즉 높이가 딱 맞아 떨어질 때)
    if floor == 0:
        floor = h
        room_number-=1

    print(floor*100 + room_number)

