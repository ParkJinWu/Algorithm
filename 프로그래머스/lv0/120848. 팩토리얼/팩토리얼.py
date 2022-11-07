import math

def solution(n):
    factorial_array = []
    answer = 0
    
    for i in range(10,0,-1):
        factorial_array.append(math.factorial(i))
    
    factorial_array.sort()

    for j in range(len(factorial_array)):
        if n == factorial_array[j]:
            return j+1
        elif n > factorial_array[j] and n < factorial_array[j+1]:
            return j+1
        
        
        
        
    return answer