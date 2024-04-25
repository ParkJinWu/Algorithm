function solution(x, n) {
    var arr = [];
    for(let i = x ; arr.length < n  ; i+=x){
        arr.push(i)
    }
    return arr;
}
