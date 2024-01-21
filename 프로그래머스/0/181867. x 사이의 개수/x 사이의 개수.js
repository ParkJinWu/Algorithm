function solution(str) {
    let answer = [] ;
    for(i of str.split('x')){
        answer.push(i.length);
    }
    return answer;
}