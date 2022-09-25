#Boj - 2751 수 정렬하기 2
import sys

n = int(input())

sort_ary = []

for i in range(n):
    sort_ary.append(int(sys.stdin.readline()))

sort_ary = sorted(sort_ary)

print('\n'.join(map(str, sort_ary)))