function solution(x) {
    var answer = true;
    let arr = x.toString().split('');
    
    let harshad  = 0 ;
    arr.forEach(el => harshad += Number(el));
    
    return x % harshad === 0 ? true : false;
}