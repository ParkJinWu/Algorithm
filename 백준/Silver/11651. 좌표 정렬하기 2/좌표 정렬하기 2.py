#BOJ - 11651 좌표 정렬하기2
import sys
input = sys.stdin.readline
n = int(input())

li = []
for i in range(n):
    x,y = map(int,input().split())
    li.append((y,x))#y가 기준이기 때문에 y를 먼저 넣기위해 y가 x보다 앞에와야된다.

li.sort()

for i in range(n):
    print(li[i][1],li[i][0])
