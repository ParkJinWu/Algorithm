// 백준 : 상수
const [A,B] = require('fs').readFileSync('/dev/stdin').toString().split(' ');

const numA = Number(A.split('').reverse().join(''));
const numB = Number(B.split('').reverse().join(''));
console.log(numA > numB ? numA : numB);