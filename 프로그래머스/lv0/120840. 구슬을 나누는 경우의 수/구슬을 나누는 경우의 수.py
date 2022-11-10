import math

def solution(balls, share):
    answer = 0
    n =  math.factorial(balls) # n!
    m = math.factorial(share) # m!
    bottom = math.factorial(balls-share) * m
    return n/bottom