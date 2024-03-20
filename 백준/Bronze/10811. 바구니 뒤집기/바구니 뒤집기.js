// 백준 : 바구니 뒤집기
const fs = require('fs');
let [[N,M],...input] = fs.readFileSync('/dev/stdin').toString().split("\n").map(x => x.split(' ').map(Number));

let basket = [];
for(let i = 1 ; i <= N ; i++){
    basket.push(i);
}

for(let i = 1 ; i <= M ; i++){
    const [a,b] = input[i-1];
    let tmpArr = [];

    for(let j = a - 1 ; j < b ; j++){
        tmpArr.push(basket[j]);
    }
    tmpArr.reverse();
    basket.splice(a-1,tmpArr.length,...tmpArr);

}
console.log(basket.join(' '));