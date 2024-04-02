// 백준 : 그대로 출력하기
const input = require('fs').readFileSync('/dev/stdin').toString().trim().split('\n');

for(x of input){
    console.log(x);
}