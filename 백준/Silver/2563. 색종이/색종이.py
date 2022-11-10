#boj 2563
import sys

ary = [[0 for _ in range(101)] for _ in range(101)]
result = 0
N = int(input())

for _ in range(N):
    x,y = list(map(int,sys.stdin.readline().split()))

    for i in range(x,x+10):
        for j in range(y,y+10):
            ary[i][j] = 1

for i in ary:
    result +=sum(i)

print(result)



