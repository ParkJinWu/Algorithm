// 백준 : 단어 공부
const word = require('fs').readFileSync('/dev/stdin').toString().trim().split('');

let lowerWord = word.join('').toLowerCase();
let obj = {};

for(let i = 0 ; i < lowerWord.length ; i++){
    if(obj[lowerWord[i]] === undefined){
        obj[lowerWord[i]] = 1;
    }
    else{
        obj[lowerWord[i]] += 1;
    }

}

let values = Object.values(obj);
let result = '';
let cnt = 0;
//console.log(values);

for(x in obj){
    if(cnt < obj[x]){
        cnt = obj[x];
        result = x.toUpperCase();
    }
    else if(cnt === obj[x]){
        result = '?';
    }
}

console.log(result);