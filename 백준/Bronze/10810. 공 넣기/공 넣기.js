// 백준 공 넣기
const fs = require('fs');
//const filePath = process.platform === 'linux' ? '/dev/stdin' : __dirname+'/input.txt';
const [[n,m], ...input]= fs.readFileSync('/dev/stdin').toString().split('\n').map(x => x.split(' ').map(Number));

//const [n,m] = input[0].split(' ').map(Number);

let arr = new Array(n).fill(0);

for(let [i, j, k] of input){
    for(let idx = i ; idx <= j ; idx++){
        arr[idx-1] = k ;
    }
}

console.log(arr.join(' '));
