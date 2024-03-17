// 백준 공바꾸기
const fs = require('fs');
//const filePath = process.platform === 'linux' ? '/dev/stdin' : __dirname+'/input.txt';
const input= fs.readFileSync('/dev/stdin').toString().split('\n');
const [N,M] = input[0].split(' ').map(Number);

let arr = [];


for(let i = 1 ; i <= N ; i++){
    arr.push(i);
}

for(let i = 1 ; i <= M ; i++){
    const [a,b] = input[i].split(' ').map(Number);
    [arr[a-1],arr[b-1]] = [arr[b-1],arr[a-1]];
}

console.log(arr.join(' '));