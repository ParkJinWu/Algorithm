//백준 : 너의 평점은
const input = require('fs').readFileSync('/dev/stdin').toString().trim().split('\n');
let total = 0 ;
let major = 0 ;
let arr = {'A+' : 4.5, 'A0' : 4.0, 'B+' : 3.5, 'B0' : 3.0, 'C+' : 2.5, 'C0' : 2.0, 'D+' : 1.5, 'D0' : 1.0, 'F' : 0.0};

for(let str of input){
    str = str.split(' ');
    total+=Number(str[1]);
    if(str[2] === 'P'){
        total -= str[1];
    }else{
        major+=Number(str[1]) * Number(arr[str[2]]);
    }
}
console.log((major/total).toFixed(6));
