// 백준 27866번
const input = require('fs').readFileSync('/dev/stdin').toString().trim().split('\n');
const str = input[0].toString();
const idx = Number(input[1]);
console.log(str[idx-1]);