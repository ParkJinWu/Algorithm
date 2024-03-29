// 백준 : 단어의 개수

const input = require('fs').readFileSync('/dev/stdin').toString().trim();
const inputSplit = input.split(' ');

console.log(input === '' ? 0 : inputSplit.length);

