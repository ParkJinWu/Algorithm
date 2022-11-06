def solution(n):
    cnt = 0
    answer = 0
    num = []
    composite_num = []
    for i in range(2,n+1):
        for j in range(1,i+1):
            if i % j == 0:
                num.append(i)
    
    
    for i in range(2,n+1):
        if num.count(i) >=3:
            composite_num.append(num.count(i))
        
    
    return len(composite_num)