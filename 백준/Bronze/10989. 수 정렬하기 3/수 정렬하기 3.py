#BOJ - 10989 수 정렬하기 3
import sys

N = int(sys.stdin.readline())
li = [0] * 100001 # 0 ~ 10000

for _ in range(N):
    num = int(sys.stdin.readline())
    li[num] = li[num] + 1 #배열에는 각 숫자의 개수가 들어가게 된다.

for i in range(10001):
    if li[i] != 0 :
        for j in range(li[i]):
            print(i)#숫자의 수 만큼 출력
