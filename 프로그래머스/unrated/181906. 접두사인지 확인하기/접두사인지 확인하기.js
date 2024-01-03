function solution(my_string, is_prefix) {
    var len = is_prefix.length;
    return my_string.slice(0,len).includes(is_prefix) ? 1 :0;
}