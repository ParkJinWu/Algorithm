function solution(n) {
    var answer = 0;
    for(i of n.split("")){
        answer += Number(i) ;
    }
    return answer % 9 ;
}