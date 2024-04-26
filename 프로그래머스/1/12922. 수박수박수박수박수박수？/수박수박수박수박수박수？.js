function solution(n) {
    var answer = '';
    let s = '수';
    let b = '박';
    while(true){
        answer += s;
        if(answer.length == n)break;
        answer += b;
        if(answer.length == n)break;

    }
    return answer;
}