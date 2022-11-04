def solution(my_string):
    collection = ("a,e,i,o,u")
    answer = ''
    for i in collection:
        my_string = my_string.replace(i,"")
    return my_string