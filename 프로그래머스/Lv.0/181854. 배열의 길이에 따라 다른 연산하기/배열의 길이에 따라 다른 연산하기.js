function solution(arr, n) {
    let len = arr.length % 2 == 0;
    if(len) return arr.map((el, idx) => idx % 2 == 1 ? el+n : el);
    else return arr.map((el,idx) => idx % 2 == 0 ? el+n : el)

 
}