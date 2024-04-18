// 백준 : 진법 변환
const [N,B] = require('fs').readFileSync('/dev/stdin').toString().trim().split(' ');
const base = Number(B);
const char = N.split('').reverse()
let result = 0;

for(let i = 0 ; i < N.length ; i++){
    let utf = char[i].charCodeAt();

    if(utf >= 65 && utf <= 90){ //A~Z
        result += (utf - 55) * Math.pow(base,i);
    }else{
        result += Number(char[i]) * Math.pow(base,i);
    }

}
console.log(result);