// 백준  : 평균
const fs = require('fs');
const input =  fs.readFileSync('/dev/stdin').toString().trim().split('\n');

const N = input[0];
const score = input[1].split(' ').map(Number);
const maxScore = Math.max(...score);
let sum = 0;

let newArr = score.map((el) => {
    return el / maxScore * 100;
});

for(let i = 0 ; i < N ; i++){
    sum+=newArr[i];
}

console.log(sum/N);