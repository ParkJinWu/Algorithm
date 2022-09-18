#BOJ - 9020 - 골드바흐의 추측
import sys
from math import sqrt

def check_prime(num):
    if num == 1 :
        return False

    for x in range(2,int(sqrt(num)+1)):
        if num % x == 0 :
            return False
    else:
        return True

t = int(sys.stdin.readline())

for _ in range(t):
    tc = int(sys.stdin.readline())

    a, b = tc//2 , tc//2

    while a> 0 :
        if check_prime(a) and check_prime(b):
            print(a, b)
            break

        else:
            a-=1
            b+=1
