//백준 : 과제 안 내신분..?
const fs = require('fs');
let input = fs.readFileSync('/dev/stdin').toString().split("\n").map(Number);

let arr = [];
for(let i = 1 ; i <= 30 ; i++){
    arr.push(i);
}

const a = arr.filter((x) => !input.includes(x));


console.log(a.join(' '));
