// 백준 : 최댓값
const input = require('fs').readFileSync('/dev/stdin').toString().trim().split('\n').map(x => x.split(' ').map(Number));
let max = 0 ;
let arr = [] ;

for(let i = 0 ; i < 9 ; i++){
    for(let j = 0 ; j < 9 ; j++){
        if(input[i][j] >= max){
            max = input[i][j];
            arr = [i+1,j+1];
        } 
    }
}
console.log(max);
console.log(arr.join(' '));