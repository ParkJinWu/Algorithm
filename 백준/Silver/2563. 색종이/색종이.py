#boj 2563
import sys

ary =[[0]*100 for _ in range(100)] #2차원 배열 선언
N = int(input())
for _ in range(N):
    x,y = list(map(int,input().split()))

    for row in range(x,x+10):
        for col in range(y,y+10):
            ary[row][col] = 1

result = 0

for i in ary:
    result +=sum(i)

print(result)







