H,M = map(int,input().split()) #시간(M)과 분(M)을 입력 받는다.

if M >= 45: #분이 45이상이면 45를 빼도 시간이 바뀌지않는다.
    print(H,M-45)

#시간이 자정보다 크고 분이 45분보다 작으면 시간이 1시간 줄어야하고,
#분은 15분 더해야 -45값이나온다.
elif H > 0 and M < 45:
    print(H-1,M+15)

else: #자정이면
    print(23,M+15)


