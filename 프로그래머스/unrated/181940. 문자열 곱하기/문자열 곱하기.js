function solution(my_string, k) {
    var answer = '';
    for (let i = 0 ; i <k ; i++){
        answer += my_string;
    }

    return answer;
}


    /*
    
        console.log(my_string.repeat(k));
        
        repeat() 함수 사용 
        문자열의 reapeat() 메소드를 이용, 숫자를 넣어주면 해당 숫자만큼 문자열이 반복
    */