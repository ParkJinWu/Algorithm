function solution(n) {
    var answer = [];
    let arr = n.toString().split('');
    return arr.map(el => Number(el)).reverse();
}