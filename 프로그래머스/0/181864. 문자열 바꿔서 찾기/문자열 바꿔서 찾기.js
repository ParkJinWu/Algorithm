function solution(str, pat) {
    var answer = '';
    for(i of str){
        answer +=i == 'A' ? 'B' :'A';
        }  
    return answer.includes(pat) ? 1 : 0;
}