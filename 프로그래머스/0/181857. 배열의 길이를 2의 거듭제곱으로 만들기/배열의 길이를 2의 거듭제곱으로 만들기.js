function solution(arr) {
    var answer = [...arr];
    let num = 1;
    
    while(true){
        if(arr.length <= num) break;
        num *= 2;
    }
    
    for(i = 0 ; i < num - arr.length ; i++){
        answer.push(0);
    }
    return answer;
}