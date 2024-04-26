function solution(absolutes, signs) {
    var answer = 0;
    absolutes.filter((el,idx) => {
        if(signs[idx]) answer+= el;
        else answer -= el;
    })
    return answer;
}