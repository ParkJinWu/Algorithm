function solution(str, m, c) {
    var answer = '';
    for(let i = c -1 ; i< str.length ; i+=m){
        answer+=str[i]
    }
    return answer;
}