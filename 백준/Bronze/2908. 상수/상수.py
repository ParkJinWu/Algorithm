# BOJ - 2908 상수
A,B = map(list,input().split())

A.reverse()
B.reverse()

A1 = ''.join(A)
B1 = ''.join(B)

if A1 > B1: print(A1)
else:print(B1)