// 백준 : 팰린드롬인지 확인하기
const word = require('fs').readFileSync('/dev/stdin').toString().trim().split('');

const str1 = word.join('');
const str2 = word.reverse('').join('');

console.log(str1 == str2 ? 1 : 0);
