function solution(li, n) {
    var arr2 = li.slice(0,n);
    let arr1 = li.slice(n);
    
    arr2.forEach((el) => arr1.push(el));
    return arr1;
}