function solution(li) {
    var answer = '';
    let num = 0;
    
    for(i = 0 ; i <= li.length ; i++){
        const n = li[i+1] - li[i] ; 
       if(li[i+1] - li[i]  === 1) answer += 'w';
        else if (n === -1) answer += 's';
        else if (n === 10) answer += 'd';
        else if (n === -10) answer += 'a';
    }
    return answer;
}