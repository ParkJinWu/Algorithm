function solution(str, indices) {
    var answer = '';
  
    for(i = 0 ; i< str.length ; i++){
        if(!indices.includes(i)){
            answer+=str[i];
        }
    }
    

    return answer;
}