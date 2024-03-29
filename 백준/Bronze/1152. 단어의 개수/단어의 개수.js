// 백준 : 단어의 개수
const input = require('fs').readFileSync('/dev/stdin')
.toString().split(' ');

let cnt = 0 ;

for(let i = 0 ; i < input.length ; i++){
    if(input[i] == '' || input[i] == '\n'){
        cnt++;
    }    
}
console.log(input.length - cnt);
