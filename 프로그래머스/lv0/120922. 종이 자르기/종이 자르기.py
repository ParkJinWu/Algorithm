def solution(M, N):
    answer = M*N
    if answer == 1:
        return 0 
    else:
        answer = answer - 1
    return answer