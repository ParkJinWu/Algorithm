// 백준 : 색종이
const [N,...input] = require('fs').readFileSync('/dev/stdin').toString().trim().split('\n').map(x => x.split(' ').map(Number));

let arr = Array.from({length : 100},() => Array(100).fill(0));
let size = 0 ;
let tmp = 0;

for(let i = 0 ; i < N ; i++){
    let [a,b] = input[i];
    for(let row = a ; row < a+10; row++){
        for(let col = b ; col < b+10 ; col++){
            if(arr[row][col] === 1) continue;
            arr[row][col]+=1;
            size++;
        }
    }
}

console.log(size);
