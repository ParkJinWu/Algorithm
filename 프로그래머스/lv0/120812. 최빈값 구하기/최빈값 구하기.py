from collections import Counter

def solution(array):
    
    counter = Counter(array)
    
    maximum = counter.most_common(1)[0][0]
    
    if len(counter) == 1:
        return maximum
    else:
        first = counter.most_common(2)[0][1]
        second = counter.most_common(2)[1][1]
        
        if first == second:
            return -1
        else:
            return maximum

