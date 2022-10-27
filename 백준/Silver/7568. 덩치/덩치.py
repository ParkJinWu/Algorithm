n = int(input())
stu_li = []
for _ in range(n):
    weight,height = map(int,input().split())
    stu_li.append((weight,height))

for i in stu_li:
    rank = 1
    for j in stu_li:
        if i[0]<j[0] and i[1] < j[1]:
            rank+=1
    print(rank)
