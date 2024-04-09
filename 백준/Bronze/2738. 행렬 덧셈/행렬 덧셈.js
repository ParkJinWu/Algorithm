// 백준 : 행렬 덧셈
const [NM,...input] = require('fs').readFileSync('/dev/stdin').toString().trim().split('\n').map(x => x.split(' ').map(Number));

const [N,M] = NM;
const a = [];
const b = [];
let result = '';


for(let i = 0 ; i < input.length ; i++){
    if(i < N) a.push(input[i]);
    else b.push(input[i]);
}

for(let i = 0 ; i < N ; i++){
    for(let j = 0 ; j < M ; j++){
        result += `${a[i][j] + b[i][j]} `;
    }
    result += '\n';
}

console.log(result);