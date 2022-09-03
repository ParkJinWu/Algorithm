n = int(input()) #테스트 케이스의 개수 입력

for i in range(n): #테스트 케이스 개수만큼 반복
    li = list(input()) #OX퀴즈를 입력한다.
    score = 0 #점수
    sum = 0 # 문제의 총합

    for j in li: #OX퀴즈 리스트를 j에 넣는다.
        if j == 'O': #퀴즈를 맞췄을 경우(O)
            score += 1 #점수 증가
        else: #퀴즈를 틀렸을 경우(X)
            score = 0 #연속된 점수를 합산해야하기 때문에점수 초기화
        sum += score # 문제의 점수 초기화
    print(sum)


