def solution(array):
    median = 0
    idx = 0
    a = sorted(array)
    
    if len(a) % 2 == 0: #짝수
        idx = len(a)//2
        median = (a[idx-1]+a[idx])/2
        
    else : #홀수
        idx = len(a)//2
        median = a[idx]
        
    return median
        