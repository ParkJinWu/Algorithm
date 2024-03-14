const fs = require('fs');
let input = fs.readFileSync('/dev/stdin').toString();

let n = Number(input/4);
let str = '';

for(let i = 0 ; i < n ; i++){
        str+='long ';
    }
    console.log(str+'int');
