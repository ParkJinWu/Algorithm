function solution(str) {
    var answer = [];
    let arr = str.split("x").sort();
    for(i of arr){
        if(i) answer.push(i); 
    }
    return answer;
}