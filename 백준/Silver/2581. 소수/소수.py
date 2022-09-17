# BOJ - 2581 소수
m = int(input())
n = int(input())
sosu = []


for num in range(m,n+1):
    cnt = 0
    if num == 1:
        continue

    for x in range(2,num):
        if num % x == 0:
            cnt+=1
            break
    if cnt == 0 :
        sosu.append(num)

#print(sosu)

if (len(sosu)>0):
    print(sum(sosu))
    print(min(sosu))
else: print(-1)
