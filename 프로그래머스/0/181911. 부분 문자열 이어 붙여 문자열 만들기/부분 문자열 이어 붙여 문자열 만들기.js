function solution(str, parts) {
    var answer = '';
    for(i = 0 ; i<parts.length; i++){
        answer+= str[i].slice(parts[i][0],parts[i][1]+1);
    }
    return answer;
}