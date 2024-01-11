function solution(num_list) {
    var answer = 0;
    if (num_list.length >= 11){
        answer = num_list.reduce((acc,value) => acc+value);
    }
    else {
        answer = num_list.reduce((acc,value) => acc*value);
    }
    return answer;
}