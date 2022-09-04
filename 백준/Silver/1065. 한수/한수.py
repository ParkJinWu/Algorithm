# BOJ - 1065 한수
num = int(input())
hansu_cnt = 0

for i in range(1,num+1):
    if i <100 :
        hansu_cnt +=1

    else:
        li = list(map(int,str(i)))
        #숫자는 해당 숫자를 이루는 각각의 자릿수 숫자를 분리할 수 없기 때문에
        #만약 입력받은 수 가 110이면 110을 str(i)로 문자열로 바꿔줘서 각 자릿수를 분리하고
        # 다시 문자열의 모든 요소를 int형으로 변환하고 리스트로 만든다.

        if li[0] - li[1] == li[1] - li[2] : #앞 두자리의 차이와 뒤의 두자리의 차이가 같으면 한수
            hansu_cnt+=1


print(hansu_cnt)




