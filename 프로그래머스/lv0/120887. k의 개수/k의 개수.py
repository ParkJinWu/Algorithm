from collections import Counter

def solution(i, j, k):
    answer = 0
    li = []

    for x in range(i,j+1):
        x = str(x)
        li.append(x)
    
    k = str(k)
    
    for c in li:
        cnt = Counter(c)
        answer+= cnt[k]
    
    return answer