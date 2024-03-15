// 백준 : 최댓값
const fs = require('fs');
const filePath = process.platform === 'linux' ? '/dev/stdin' : './input.txt';
let input = fs.readFileSync(filePath).toString().split('\n').map(Number);

let max = input[0];
let idx = 0;
for(let i  = 0 ; i < input.length ; i++){
    if(max < input[i]){
        max = input[i];
        idx = i;
    }
}
console.log(max);
console.log(idx+1);