function solution(n, m) {
    var answer = [];
    let [a,b] = gcd(n,m);
    return [a,a*b];
}

function gcd(n,m){
    let num = 0;
    let least = 0;
    
    for(let i = 0 ; i < Math.max(n,m); i++){
        if(n % i == 0 && m % i == 0){
            num = i;
        }
    }
    least = (n / num) * (m / num);

    return [num,least];
}


