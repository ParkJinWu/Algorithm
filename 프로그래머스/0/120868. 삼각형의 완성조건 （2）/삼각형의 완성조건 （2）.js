function solution(sides) {
    var answer = 0;
    const maxNum = Math.max(...sides) , minNum = Math.min(...sides);
    
    for(let i = maxNum - minNum + 1 ; i <= maxNum ; i++){
        answer++;
    }
    
    for(let i = maxNum + 1 ; i < maxNum+minNum ; i++){
        answer++;
    }
    
    return answer;
}