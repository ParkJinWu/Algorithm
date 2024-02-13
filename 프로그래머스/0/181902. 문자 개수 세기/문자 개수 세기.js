function solution(my_string) {
    var answer = Array(52).fill(0);
    
    for(i = 0 ; i < my_string.length ; i++){
        const code = my_string.charCodeAt(i);
        
        if(code >= 65 && code <=90){
            console.log("대문자" + my_string[i]);
            answer[code - 65] += 1;
        }
        else if(code >= 97 && code <= 122){
            console.log("소문자" + my_string[i]);
            answer[code - 97 + 26] += 1;
        }
        
    }
    
    
    
    return answer;
}