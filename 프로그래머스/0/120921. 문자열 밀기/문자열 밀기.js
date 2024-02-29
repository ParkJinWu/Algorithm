function solution(A, B) {
    let cnt = 0;
    let arr = [...A];
    
    if(A === B) return 0;
    
    for(let i = arr.length-1 ; i >= 0 ; i--){
        arr.unshift(arr.pop());
        cnt++;
        if(arr.join('') === B) return cnt;
    }
    return -1;
}