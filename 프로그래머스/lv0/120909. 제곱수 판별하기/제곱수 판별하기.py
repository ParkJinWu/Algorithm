import math

def solution(n):
    answer = 0
    s = int(math.sqrt(n))
    if n == (s*s):
        return 1
    else:
        return 2
