import re

def solution(my_string):
    answer = re.findall(r"\d+",my_string)
    result = 0
    for i in answer:
        result+=int(i)
    return result