H,M = map(int,input().split()) #시,분,초
time =int(input()) #요리하는데 필요한 시간(타이머)이 분으로 입력된다.

H += time //60 # 입력받은 시간(H)에 요리하는 데 필요한 경과시간(time)을 60분(1시간)으로 나눈 몫으로 갱신
M += time % 60 #입력받은 분(M)에 요리하는 데 필요한 경과시간(time)을  60초(1분)으로 나눈 몫으로 갱신

if M >= 60: #분(M)이 60보다 클 경우
    H += 1 #1시간이상이기 때문에 시간(H)를 1 증가하고
    M -=60 #분(M)에서 60을 뺀다.


if H >= 24: #시(H)가 24보다 클 경우
    H -=24 #시(H)에서 1을 뺀다.



print(H,M)
