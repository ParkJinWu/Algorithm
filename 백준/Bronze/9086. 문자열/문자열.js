// 백준 문자열
const input = require('fs').readFileSync('/dev/stdin').toString().trim().split('\n');
const T = Number(input[0]);

for(let i = 1 ; i <= T ; i++){
    console.log(input[i].substring(0,1) + input[i].substring(input[i].length-1,input[i].length));
}
