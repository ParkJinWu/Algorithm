let word = require('fs').readFileSync('/dev/stdin').toString().trim()
let croatia = ["c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="];



    for(let x of croatia){
        word = word.replaceAll(x,'@'); 
    }
    
    console.log(word.length);