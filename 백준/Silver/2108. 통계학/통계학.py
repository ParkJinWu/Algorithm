# boj - 2108 통계학
from collections import Counter
import sys
N = int(input())

li = []
for _ in range(N):
    li.append(int(sys.stdin.readline()))

print(round(sum(li)/N)) #산술평균

li.sort()
print(li[int(N/2)]) #중앙값

cnt = Counter(li).most_common()
#print(cnt)

if len(cnt) > 1 :
    if cnt[0][1] == cnt[1][1]:
        print(cnt[1][0])
    else:
        print(cnt[0][0])

else: print(cnt[0][0])

#print(li)
print(max(li)-min(li))