def solution(numbers):
    answer = ''
    num = list(map(str,numbers))
    num.sort(key = lambda x: x*3, reverse= True)
    
    #print(num.sort(key = lambda x: x*3, reverse= True))
    #str(int(''.join(numbers)))
    #print(num)
    return str(int("".join(num)))