# BOJ - 2775 부녀회장이 될테야

t = int(input()) #테스트 케이스

for _ in range(t):
    floor,num = int(input()), int(input())


    apt = [i for i in range(1,num+1)]


    for _ in range(floor):#층
        for j in range(1,num): #호수

            apt[j] += apt[j-1]

    print(apt[-1])












