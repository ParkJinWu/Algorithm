//백준 : 세로 읽기
const input = require('fs').readFileSync('/dev/stdin').toString().trim().split('\n');
let len = input.map(x => x.length);
let maxLen = Math.max(...len);
let result = '';

for(let i = 0 ; i < maxLen ; i++){
    for(let j = 0 ; j < input.length ; j++){
        result += input[j][i] ?? '';
    }
}

console.log(result);