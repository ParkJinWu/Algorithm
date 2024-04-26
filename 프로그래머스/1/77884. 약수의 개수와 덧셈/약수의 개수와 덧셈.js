function solution(left, right) {
    var answer = 0;

    for(let num = left ; num <= right ; num++){
        let cnt = 0 ;
        
        for(let i = 1 ; i <= num ; i++){
            if(num % i == 0) cnt++ 
        }
        
        if(cnt % 2 == 0) answer+= num;
        else answer += -num;

    }

    return answer;
}