//백준 : 진법 변환 2
let [N,B] = require('fs').readFileSync('/dev/stdin').toString().trim().split(" ").map(Number);
//let result = '';
let result = [] ;// 문자열이 아닌 배열로 초기화한 이유는 나중에 reverse() 해야하기때문에

while(N >= B){
    let remain = N % B; // 나머지
    let share = Math.trunc(N / B) ; // 몫

    //console.log("몫 : " ,N);
    //console.log("나머지 : ",remain);

    if(remain < 10){
        result.push(remain);
    }else{
        result.push(String.fromCharCode(remain+55));
    }

    N = share;

}

if(N < 10){ // 마지막 나머지
    result.push(N);
}else{
    result.push(String.fromCharCode(N+55));
}

console.log(result.reverse().join(''));