function solution(a, b) {
    var answer = 0;
    a.forEach((el,idx) => {
        answer += el * b[idx];
    })
    return answer;
}