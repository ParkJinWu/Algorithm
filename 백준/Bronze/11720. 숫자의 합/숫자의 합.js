// 백준 숫자의 합
const input = require('fs').readFileSync('/dev/stdin').toString().trim().split('\n');
const N = Number(input[0]);
const target = input[1];
let sum = 0;

for(let i = 0 ; i < N ; i++){
    sum+=Number(target[i]);
}

console.log(sum);