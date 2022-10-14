#BOJ - 11650 좌표 정렬하기

n = int(input())

li = []
for i in range(n):
    a,b = map(int,input().split())
    li.append((a,b))

li.sort()
for i in range(n):
    print(li[i][0],li[i][1])
