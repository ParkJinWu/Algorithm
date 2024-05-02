function solution(n) {
    let oneCnt = 0 ; // 1의 개수
    
    n.toString(2).split('').forEach(x => {
        if(x==='1') oneCnt++;
    });
    
    for(let i = n+1 ; i < 1000000 ; i++){
        let tmp  = i.toString(2).split('').filter(x => x === '1').length;
        if(tmp === oneCnt) return +i.toString(10);
        
    }

}