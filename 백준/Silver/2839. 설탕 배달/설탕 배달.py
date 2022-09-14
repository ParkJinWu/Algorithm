# BOJ - 2839 설탕배달
n = int(input()) #설탕 N킬로그램
bag = 0 # 봉지 개수

while n >= 0 : #설탕이 0보다 크거나 같을 때까지 반복
    if n % 5 == 0: # 5kg로 다 가져갈 수 있을 경우(5의배수)
        bag = bag + (n//5) #봉지의 개수를 더해준다
        print(bag) #봉지 개수 출력
        break #while문 탈출

    n -= 3 # 5kg으로 딱 나누어 떨어지지 않기 때문에 3kg를 빼주고
    bag += 1 # 봉지의 개수를 1개 늘려준다.

else:
        print(-1)