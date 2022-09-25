#BOJ - 25305 커트라인
import sys

#input = sys.stdin.readline()

def cutline(li,k):
    return sorted(li,reverse=True)[k-1]

n,k = map(int,input().split())
score = list(map(int,input().split()))

print(cutline(score,k))