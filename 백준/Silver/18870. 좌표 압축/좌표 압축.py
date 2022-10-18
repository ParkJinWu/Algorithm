#BOJ - 18870 좌표 압축
import sys
n = int(sys.stdin.readline())
num = list(map(int,sys.stdin.readline().split()))
arr = sorted(set(num))

dic = {arr[i]:i for i in range(len(arr))}
#print("dic=",dic)
#print("input=",num)

for i in num:
    #print("i:",i)
    #print(dic[i],end=" ")
    #print()
    print(dic[i], end=" ")