// 백준 알파벳 찾기
const S = require('fs').readFileSync('/dev/stdin').toString().trim();
const alphabet = Array.from({length : 26},(v,i) => String.fromCharCode(i+97));
let result = [];
for(let i = 0 ; i < alphabet.length ; i++){
    //result += (` ${S.indexOf(alphabet[i])}`);
    result.push(S.indexOf(alphabet[i]));
}
console.log(result.join(' '));
