# 최댓값

li =[] #입력받은 수를 저장할 빈 리스트 초기화

for i in range(9): # 0~8 총 9개의 입력을 받기 위한 반복문
    li.append(int(input()))  # append()함수를 입력받은 수를 이용해 li리스트에 추가 해준다.

print(max(li)) #최댓값 출력 
print( li.index(max(li))+1 ) #index()함수를 이용해 위치 출력