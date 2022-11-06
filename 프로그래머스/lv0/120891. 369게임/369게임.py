def solution(order):
    answer = 0
    num = [3,6,9]
    for i in str(order):
        if int(i) in num:
            answer+=1
    return answer