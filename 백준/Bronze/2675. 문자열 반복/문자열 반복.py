# BOJ - 2675 문자열 반복

cnt = int(input()) #테스트 케이스 개수

for i in range(cnt): #테스트 케이스만큼 반복
    num,string = input().split() #각 테스트 케이스 반복횟수,문자열이 공백으로 구분되어 입력됐을 때 split()으로 분리
    num = int(num) #입력받은 num은 문자열이기 때문에 int형으로 형변환한다.

    for i in range(len(string)): #문자열의 개수만큼 반복
        print(string[i]*num , end='') #각 문자열을 반복횟수만큼 출력하기위해 곱하고, 개행을 없앤다.
    print() # 다음 테스트 케이스 출력을 위한 줄바꿈




