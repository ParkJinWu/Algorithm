# 셀프넘버 - 4673
# 셀프넘버: 생성자를 가지지않는 숫자.

#셀프넘버를 출력하기전에 셀프넘버가 아닌 값 즉 생성자를 가지는 값을 구하는 함수를 작성
def d(n):
    result = n #입력받은 매개변수(1234)를 result에 넣는다.
    while n > 0: #1234
        result += n % 10 # 1234 % 10 = 4 -> 123 % 10 3 ... 1234 + 1 + 2 + 3 + 4
        n = n // 10 # 1234 // 10 = 123
    return result


#print(d())# d(n)함수에 서 나오는 값들은 셀프넘버가 아니다.


not_self_number = set() # 셀프넘버가 아닌 숫자들을 중복값을 허용하지 않게 set()형으로 선언.

for i in range(1,10001): # 1~10000사이
    result = d(i) # 1~10000값을 d()함수에 차례대로 넣은 값 즉 셀프넘버가 아닌 값을 result변수에 넣는다.
    not_self_number.add(result) #set()자료형의 add()함수를 이용해 값을 추가한다.

for i in range(1,10001): # 1~10000사이
    # 1~10000사이 값이 셀프넘버가 들어있지 않은 변수(not_self_numer)에 포함되지 않으면(not in) 
    if i not in not_self_number: 
        print(i)# 출력






