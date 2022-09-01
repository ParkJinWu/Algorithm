#영수증

total = int(input()) #총금액
count = int(input()) #종류

sum =0 # 총 금액 비교할 변수 초기화

for i in range(count): #종류만큼 반복
    a,b = map(int,input().split()) #각 물건의 가격(a) 개수(b)

    sum += a * b # 가격(a) X 개수(b)를 sum변수에 저장

if sum == total:print("Yes") #같으면 Yes

else: print("No") #다르면 No