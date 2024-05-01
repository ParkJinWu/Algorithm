function solution(n) {
    let boundary = n/2;//자기자신
    let cnt = 1 ;
    
    for(let i = 1 ; i < boundary ; i++){
        let total = 0;
        for(let j = i ; j<=n ; j++){
            total += j; 
            if(total === n) cnt++
            if(total > n) break
        }
        
    }
    return cnt;
}