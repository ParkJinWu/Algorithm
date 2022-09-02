# A+B - 4

while 1: #테스트 케이스의 숫자가 안주어졌기 때문에 일단 무한루프를 돈다.
    try:
        a, b = map(int, input().split()) #a,b를 입력받고

    except: # 입력을 하지 않아 에러가 발생한다면 break문 실행
        
        break

    print(a + b)




