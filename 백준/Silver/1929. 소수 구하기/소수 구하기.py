

m, n = map(int, input().split())

def check_prime(num):
    if num == 1:
        return False

    else:
        for x in range(2,int(num ** 0.5) +1):
            if num % x == 0:
                return False

        return True

for i in range(m,n+1):

    if check_prime(i):print(i)
