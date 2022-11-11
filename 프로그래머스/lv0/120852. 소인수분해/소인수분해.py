def solution(n):
    result = []
    answer = []
    
    for i in range(2,n+1):
        while n % i == 0:
            result.append(i)
            n = n//i
            
        if n == 1:
            break
            
    for i in result:
        if i not in answer:
            answer.append(i)
    
    return answer