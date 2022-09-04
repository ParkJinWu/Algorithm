# BOJ - 10809 앞파벳 찾기
word = input()
alphabet = list(range(97,123))  # 아스키코드 숫자 범위

for x in alphabet :
    print(word.find(chr(x)), end = ' ' )#chr()함수를 이용해 아스키 코드 값을 입력받아 그 코드에 해당하는 문자 출력
