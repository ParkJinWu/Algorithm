function solution(n) {
    var answer = [];
    for(i = 0 ; i<n.length ; i+=5){
        answer.push(n[i]);
    }
    return answer;
}