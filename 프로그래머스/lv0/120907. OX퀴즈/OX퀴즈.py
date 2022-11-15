def solution(quiz):
    answer = []
    a = 0
    
    while a != len(quiz):
        s = quiz[a].split()
        if s[1] == "-":
            if (int(s[0]) - int(s[2])) == int(s[len(s)-1]):
                answer.append("O")
            else: answer.append("X")
        if s[1] == "+":
            if (int(s[0]) + int(s[2])) == int(s[len(s)-1]):
                answer.append("O")
            else: answer.append("X")
                
        a+=1
          
    return answer