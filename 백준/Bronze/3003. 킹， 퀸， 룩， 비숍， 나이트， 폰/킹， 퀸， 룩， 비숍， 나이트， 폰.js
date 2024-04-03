// 백준 : 킹, 퀸, 룩, 비숍, 나이트, 폰

const input = require('fs').readFileSync('/dev/stdin').toString().trim().split(' ');

const arr = [1,1,2,2,2,8];
let piece = [];
for(let i = 0 ; i < input.length ; i++){
    piece.push(arr[i] - input[i]);
}
console.log(piece.join(' '));

