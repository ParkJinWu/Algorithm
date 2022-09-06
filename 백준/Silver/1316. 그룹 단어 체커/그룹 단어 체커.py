#BOJ - 1316 그룹 단어 체커

a = int(input())
cnt = a #차감형식으로 할꺼니깐  입력받는 단어의 수만큼 카운트 선언

for i in range(a):
    word = input()
    for j in range(len(word)-1): #0부터니깐 len(word)-1
        if word[j] == word[j+1]: #word[0] == word[1]이면 연속된 문자이니깐
            pass #아무것도 안하고 pass
        elif word[j] in word[j+1:]: #만약 j가 0이면 word[0]이 word[1]번째부터 끝까지 중에서 존재하면
            cnt-=1 #카운트 -1
            break

print(cnt)











