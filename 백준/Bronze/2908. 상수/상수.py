# BOJ - 2908 상수
A,B = map(list,input().split()) #map함수를 이용해 입력받은 요소를 list로 변환해준다.

A.reverse() #reverse()함수를 이용해 뒤집는다
B.reverse()

A1 = ''.join(A)
B1 = ''.join(B)


print(max(A1,B1))
