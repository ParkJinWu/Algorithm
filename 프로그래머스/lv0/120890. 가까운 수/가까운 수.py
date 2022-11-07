def solution(array, n):
    a = []
    array.sort()
    for i in array:
        a.append(abs(n - i))
    return array[a.index(min(a))]