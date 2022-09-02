# 나머지

li = [] # 입력 받을 숫자를 저장할 빈 리스트 초기화 

for i in range(10): # 0~9반복
    li.append( (int(input()) % 42 )) #각 요소를 42로 나눈 나머지를 li리스트에 append한다.
    data = set(li) # 중복제거를 위해서 set()으로 형변환 후 저장

print(len(data)) #len()함수를 이용해 길이 출력

