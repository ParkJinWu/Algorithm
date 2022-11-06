def solution(numbers):
    numbers = sorted(numbers)
    if (numbers[0]*numbers[1])>(numbers[-1]*numbers[-2]):
        answer = numbers[0]*numbers[1]
    else:
        answer = numbers[-1]*numbers[-2]
        
        
    return answer