num = [1,1,2,2,2,8]
li = list(map(int,input().split()))
for i in range(len(num)):
    print(num[i]- li[i],end=" ")