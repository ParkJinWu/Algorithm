function solution(d, budget) {
    var cnt = 0;
    let sum = 0; 
    
    d = d.sort((a,b) => a-b);

    d.forEach(price => {
        if(sum + price <= budget){
            sum += price;
            cnt++;
        }
    })

    return cnt;
}