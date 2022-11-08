import math

def solution(denum1, num1, denum2, num2):
    answer = []
    top = denum1*num2 + denum2*num1
    bottom = num1 * num2
    
    if math.gcd(top,bottom) == 1:
        return [top,bottom]
    else:
        return [top/math.gcd(top,bottom),bottom/math.gcd(top,bottom)]
