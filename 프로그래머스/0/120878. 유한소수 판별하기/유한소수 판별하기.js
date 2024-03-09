function solution(a, b) {
    let arr = [];
    let gcd = 1;
    for(let i = 1; i <= Math.min(a,b) ; i++){
        if(a % i == 0 && b % i == 0) gcd = i;
    }
    
    let bm = b / gcd;
    
    for(let i = 2; i <= bm ; i++){
        while(bm % i == 0){
            console.log(i);
            arr.push(i);
            bm/=i;
        }
    }
    
    let answer = arr.every((el) => el == 2 || el == 5);
    
    return answer ? 1: 2;
}