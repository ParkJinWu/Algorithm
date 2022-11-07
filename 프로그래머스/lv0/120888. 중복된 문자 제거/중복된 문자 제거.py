def solution(my_string):
    answer = ''
    result = []
    for i in my_string:
        if i not in result:
            result.append(i)
            
    #print(result)
    return answer.join(result)