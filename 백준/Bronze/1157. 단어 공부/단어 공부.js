// 백준 : 단어 공부
const word = require('fs').readFileSync('/dev/stdin').toString().trim().toUpperCase();

let cnt = new Array(26).fill(0);

for(let i = 0 ; i < word.length ; i++){
    cnt[word.charCodeAt(i) - 65]++;
}

const max = Math.max(...cnt);
let arr = [];

for(let i = 0 ; i < cnt.length ; i++){
    if(cnt[i] === max){
        arr.push(String.fromCharCode(i+65));
    }
}

console.log(arr.length > 1 ? '?' : arr[0]);