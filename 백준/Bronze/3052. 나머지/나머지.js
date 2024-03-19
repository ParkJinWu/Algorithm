// 백준 : 나머지
const fs = require('fs');
let [...input] = fs.readFileSync('/dev/stdin').toString().trim(' ').split('\n').map(Number);

let s = new Set();

for(let i = 0 ; i < input.length ; i++){
    s.add(input[i] % 42); 
}

console.log(s.size);