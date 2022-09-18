#BOJ - 4948 베르트랑 공준
from math import sqrt
import sys

def check_prime(num):
    if num == 1:
        return False

    for x in range(2,int(sqrt(num)+1)):
        if num % x == 0:
            return False

    return True

li = list(range(2,246912))
prime_list = []


for i in li:
    if check_prime(i):
        prime_list.append(i)


while True:
    prime_count = 0
    n = int(sys.stdin.readline())

    if n == 0 :
        break

    for i in prime_list:
        if n < i <= n*2:
            prime_count+=1
    print(prime_count)



