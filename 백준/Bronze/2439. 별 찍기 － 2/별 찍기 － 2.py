#A + B - 8

num = int(input())


for i in range(1,num+1): # 별을 1개부터 찍어야하니깐  시작을 1로 끝을 num개수만큼 뽑아야하니깐 +1
    print(" " * (num-i)+"*"*i)
    #print("%5s"% ("*" * i)) #포맷을 이용하여 총5자리에 출력

