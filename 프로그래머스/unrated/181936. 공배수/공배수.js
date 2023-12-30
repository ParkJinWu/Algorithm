function solution(number, n, m) {
    var nn = number % n ;
    var mm = number % m ; 
    var answer = (nn == 0 && mm ==0 ) ? 1: 0

    return answer;
}