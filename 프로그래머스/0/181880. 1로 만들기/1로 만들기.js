function solution(li) {
    let cnt = 0; // 카운트 
    
    li.forEach(x => {
        while(x !== 1){
            x % 2 == 0 ? x = x / 2 : x = (x-1) / 2;
            cnt++;
        }
    })
    return cnt;
}