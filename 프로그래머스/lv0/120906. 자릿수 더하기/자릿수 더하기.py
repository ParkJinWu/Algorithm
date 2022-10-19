def solution(n):
    a = []
    for i in str(n):
        a.append(i)
    return sum(map(int,a))