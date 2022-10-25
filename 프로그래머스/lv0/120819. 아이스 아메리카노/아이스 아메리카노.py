def solution(money):
    
    cnt = int(money / 5500)
    x = money % 5500
    answer = [cnt,x]
    return answer