# BOJ - 1193 분수 찾기
# a=분자 ,b=분모

X = int(input())

line = 1

while X > line: #입력받은 X가 line보다 클때 반복
    X = X - line
    line+=1 #라인을 한개 증가

if line % 2 == 0: #짝수 라인
    print("%d/%d"%(X,line-X+1))
else:
    print("%d/%d" % (line-X+1,X))



