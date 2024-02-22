function solution(arr, query) {
    var answer = [];
    query.forEach((q,i) => {
        if(!(i % 2)) arr = arr.slice(0,q+1);
        else arr = arr.slice(q);
    })
    return arr;
}