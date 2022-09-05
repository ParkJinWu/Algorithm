# BOJ - 1157 단어 공부

word = input().upper() #문자열 입력
word_list = list(set(word)) #입력받은 문자열을 set()형으로 바꿔줘서 중복 요소를 제거하고 리스트로 선언.
count_list = [] # 각 요소의 카운트를 저장하기위한 리스트


for i in word_list:
    count_list.append(word.count(i)) #처음 입력받은 문자열을 count()함수에 각 요소를 대입해 개수를 구하고, append()로 추가

if count_list.count(max(count_list)) > 1 : #만약 사용된 개수가 가장 높은게 1개 이상이면 "?"출력
    print("?")

else:#만약 사용된 개수가 가장 높은게 1개면
    max_index =  count_list.index(max(count_list)) #가장 높은 카운트의 인덱스(위치)를 저장 
    print( word_list[max_index] ) #리스트 인덱싱으로 가장 높은 카운트의 문자 출력


