function solution(arr) {
    var answer = 0;
    let prev = [...arr];
    
    for(i = 0 ; i <= arr.length ; i++){
        const next = prev.map((el) => {
            if(el >= 50 && !(el%2)) return el / 2;
            if(el < 50 && el%2) return el * 2 + 1;
            return el;
        });
        
        const isEqual = prev.every((el,idx) => el === next[idx]);
        
        if(isEqual) break;
        prev = next;
        answer++;
        
    }

    return answer;
}