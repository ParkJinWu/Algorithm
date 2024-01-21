function solution(str) {
    var answer = '';
    for (i of str){
        answer += i<'l' ? 'l' : i;
    }
    return answer;
}