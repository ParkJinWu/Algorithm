// 백준 : 다이얼
const str = require('fs').readFileSync('/dev/stdin').toString().trim().split('');
let arr = ['ABC','DEF','GHI','JKL','MNO','PQRS','TUV','WXYZ'];
let cnt = 0 ;

for(let i = 0 ; i < arr.length ; i++){
    for(let j = 0 ; j < str.length ; j++){
        if(arr[i].includes(str[j])){
            cnt += i + 3;
        }
    }
}
console.log(cnt);
