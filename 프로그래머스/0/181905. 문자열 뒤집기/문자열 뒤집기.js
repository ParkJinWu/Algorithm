function solution(str, s, e) {
    var answer = '';
    let arr = str.slice(s,e+1).split('');
    arr.reverse();
    
    let strArr = [...str];
    
    strArr.splice(s,e-s+1,...arr);

    return strArr.join('');
}