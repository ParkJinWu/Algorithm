function solution(str, pat) {
    var answer = 0;
    for(i = 0 ; i < str.length ; i++){
        const subs = str.slice(i,i+pat.length);
        if (subs === pat) answer++; 
    }
    return answer;
}