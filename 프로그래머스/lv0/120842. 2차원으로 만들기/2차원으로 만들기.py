def solution(num_list, n):
    answer = []
    
    for i in range(0,len(num_list),n):
        inner_ary = []
        for j in range(0,n):
            inner_ary.append(num_list[i+j])
            
        answer.append(inner_ary)
    return answer