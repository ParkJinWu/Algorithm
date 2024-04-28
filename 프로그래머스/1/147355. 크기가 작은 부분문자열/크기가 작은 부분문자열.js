function solution(t, p) {
    var answer = 0;
    let pLen = p.length;
    
    for(let i = 0 ; i <= t.length ; i++){
        let slice = t.slice(i,i+pLen);
        if(slice.length === pLen && Number(slice) <= Number(p)) answer++;
    }
    
    return answer;
}