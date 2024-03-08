function solution(a, b) {
    var arr = new Set();
    let gcd = 1;
    for(let i = 1 ; i <= Math.min(a,b) ; i++){
        if(a % i == 0 && b % i == 0) gcd = i ;
    }
    
   let bm = b / gcd ; // 분모(b)를 최대공약수로 나눠 기약분수의 분모로 만든다.
    
    console.log("분모 : " + bm);
    for(let i = 2 ; i <= bm ; i++){
        while(bm % i == 0 ){
            console.log("@" + bm)
            bm/=i;
            arr.add(i);
        } 
    }
    
    const answer = [...arr].every((el) => (el == 2 || el == 5));
    
    return answer ? 1 : 2;

}