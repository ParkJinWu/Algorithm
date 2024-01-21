function solution(str, ex) {
    var answer = '';
    for(i of str){
        answer += i.includes(ex) ? '' : i;
    }
    return answer;
}