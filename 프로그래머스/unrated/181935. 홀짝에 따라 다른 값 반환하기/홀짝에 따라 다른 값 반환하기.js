function solution(n) {
    var answer = 0;
    if(n % 2 == 0) {
        for (var i = 1 ; i++<=n ; i++){
            answer += i*i;   
        }
    }
    else if (n % 2 == 1) {
        for (var i = 1 ; i<=n ; i+=2){
            answer += (i); 
        }
    }
    return answer;
}