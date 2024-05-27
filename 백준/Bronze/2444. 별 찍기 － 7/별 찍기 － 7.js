// 백준 : 별찍기 - 7
const fs = require('fs');
const N = Number(fs.readFileSync('/dev/stdin'));
for(let i = 1 ; i <= N; i++){
    
    console.log(' '.repeat(N-i) + '*'.repeat(i + (i-1) ));
    
}
for(let j = N-1 ; j > 0 ; j--){
    console.log(' '.repeat(N-j) +'*'.repeat(j + (j-1)));
}