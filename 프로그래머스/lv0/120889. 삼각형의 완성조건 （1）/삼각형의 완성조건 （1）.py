def solution(sides):
    sides.sort(reverse=True)
    for i in range(len(sides)):
        if sides[i] < sides[i+1]+sides[i+2]:
            return 1
        else:
            return 2
