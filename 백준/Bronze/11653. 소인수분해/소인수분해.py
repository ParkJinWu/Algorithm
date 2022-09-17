# BOJ - 11653 소인수분해
# 1보다 큰 자연수를 소인수(소수인 인수)들만의 곱

n = int(input())

if n == 1:
    print("")


while n!=1:
    for i in range(2, n+1):
        if n % i == 0:
            print(i)
            n = n // i
            break