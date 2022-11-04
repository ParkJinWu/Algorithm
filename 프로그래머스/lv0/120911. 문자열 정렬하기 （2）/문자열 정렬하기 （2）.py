def solution(my_string):
    answer = ""
    my_string = my_string.lower()
    answer = sorted(my_string)
    return "".join(i for i in answer)