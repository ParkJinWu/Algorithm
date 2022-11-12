from itertools import permutations
def solution(spell, dic):
    answer = []
    result = 0
    
    for i in permutations(spell,len(spell)):
        answer.append("".join(i))
    
    #print(answer)
    
    for a in dic:
        if a in answer:
            result =  1
            break
        else: 
            result =  2
            
    return result
        
