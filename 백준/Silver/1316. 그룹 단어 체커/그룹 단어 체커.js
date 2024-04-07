// 백준 : 그룹 단어 체크
let [N,...input] = require('fs').readFileSync('/dev/stdin').toString().trim().split('\n');

for(let str of input){
    for(let i = 0 ; i < str.length ; i++){
        if(str[i] !== str[i+1] && str.slice(i+1).includes(str[i])){
            N--;
            break;
        }
    }
}

console.log(N);

