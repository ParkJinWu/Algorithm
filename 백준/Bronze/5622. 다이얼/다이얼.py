#BOJ - 5622 다이얼
alphabet = ['ABC','DEF','GHI','JKL','MNO','PQRS','TUV','WXYZ']#알바펫을 문자열 리스트로 생성

word = input() #단어 입력
time = 0 #걸린 시간 선언 및 0으로 초기화

for data in alphabet: #알파벳 원소별로 분리
    for x in data: #원소별로 나눠진 알파벳을 한글자로 분리

        for i in word: #입력받은 문자열을 하나씩 분리한다.
            if i == x: #만약 입력받은 문자열의 알파벳과 알파벳리스트의 알파벳과 같으면 즉 두 알파벳이 같으면
                time+=alphabet.index(data)+3 #걸린시간에다가 같은 알파벳리스트의 인덱스+3을 더해준다
                                # 1초까지는 2초걸리고 한 칸 옆에 있는 숫자를 걸기위해선 1초씩 더 걸린다

print(time)
