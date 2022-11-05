from itertools import permutations

def solution(babbling):
    answer = 0
    baby = ["aya", "ye", "woo", "ma"]
    word = []
    
    for i in range(1,len(baby)+1):
        for j in list(permutations(baby,i)):
            word.append(''.join(j))
            
    for i in babbling:
        if i in word:
            answer+=1
            
    return answer