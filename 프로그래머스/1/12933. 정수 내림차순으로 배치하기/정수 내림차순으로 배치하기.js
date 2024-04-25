function solution(n) {
    let arr = n.toString().split('').map(el => parseInt(el));
    let result = arr.sort((a,b) => b-a).join('');
    return Number(result);
}