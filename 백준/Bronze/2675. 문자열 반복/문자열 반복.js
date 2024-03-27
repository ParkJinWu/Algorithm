// 백준 : 문자열 반복

const [T,...input] = require('fs').readFileSync('/dev/stdin').toString().trim().split('\n');

for(let i = 0 ; i < T ; i++){
    let str = '';

    const [R,S] = input[i].split(' ');

    for(let j = 0 ; j < S.length ; j++){
        str+= S[j].repeat(R);
    }
    
    console.log(str);
}

