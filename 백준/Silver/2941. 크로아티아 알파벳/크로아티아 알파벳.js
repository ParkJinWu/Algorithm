const word = require('fs').readFileSync('/dev/stdin').toString().trim()
let croatia = ["c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="];

function solution(word){
    for(let x of croatia){
        word = word.replaceAll(x,'@'); 
    }
    return word.length;
};

console.log(solution(word));