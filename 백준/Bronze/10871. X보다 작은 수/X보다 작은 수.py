# X보다 작은 수

N,X = map(int,input().split()) # 정수 N개 의 X를 입력받는다.
A = list(map(int,input().split())) #수열 A를 N개만큼 입력받기위해 리스트로 받는다.
for i in range(N):

    if A[i] < X:  # 입력받은 X보다 리스트A의 요소가 작을경우 출력
        print(A[i],end=" ") # end로 구분




