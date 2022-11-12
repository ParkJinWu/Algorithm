def solution(participant, completion):
    dic = {}
    
    for i in participant:
        if i in dic:
            dic[i]+=1
        else:
            dic[i]=1

    for x in completion:
        if dic[x] == 1:
            del dic[x]
        else: #동명이인
            dic[x] -=1
    print(type(list(dic)))        
    return list(dic)[0]