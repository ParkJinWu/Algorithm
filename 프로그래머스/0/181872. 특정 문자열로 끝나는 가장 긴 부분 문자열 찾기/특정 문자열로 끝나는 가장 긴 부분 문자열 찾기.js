function solution(str, pat) {
    var answer = '';
    for(i = 0 ; i < str.length ; i++){
        const subs = str.slice(i,i+pat.length);
        
        if(subs == pat) answer = str.slice(0,i+pat.length)
        
    }
    return answer;
}