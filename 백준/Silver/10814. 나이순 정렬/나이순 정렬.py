import sys

n = int(input())
members = []

for _ in range(n):
    age,name = list(map(str,sys.stdin.readline().split()))
    age = int(age)
    members.append((age,name))

members.sort(key=lambda x: (x[0])) #나이순 정렬
#내림차순 = -x[0]

for i in range(n):
    print(members[i][0],members[i][1])
