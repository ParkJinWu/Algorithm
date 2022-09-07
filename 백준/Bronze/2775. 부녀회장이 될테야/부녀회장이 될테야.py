# BOJ - 2775 부녀회장이 될테야

t = int(input()) #테스트 케이스

for _ in range(t):
    floor,num = int(input()), int(input()) #floor = 층 , num = 호
    apt = [i for i in range(1,num+1)] #아파트의 0층을 입력받은 호수 만큼 초기화

  #  print("0층",apt)

    for _ in range(floor):#층
        for j in range(1,num): #호수

            apt[j] += apt[j-1]
  #          print("j=%d ,apt[%d] += apt[%d-1]"%(j,j,j))
  #          print("j=",apt[j])
  #          print("j-1=",apt[j-1])
  #          print(apt)

    print(apt[-1])












