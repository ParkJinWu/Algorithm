function solution(l, r) {
    var answer = [];
    for(let i = l ; i < r+1 ; i++){
        let str = String(i);
        if([...str].every(el => el === '5' || el === '0')){
            answer.push(i);   
        }
    }   
    return answer.length !== 0 ? answer : [-1];
}