# A+B - 5

while 1: #일단 무한루프를 돈다.
    a, b = map(int, input().split()) #a,b를 입력받고
    if a ==0 and b ==0: #a와b가 0일 경우 
        break #break

    print(a+b)
