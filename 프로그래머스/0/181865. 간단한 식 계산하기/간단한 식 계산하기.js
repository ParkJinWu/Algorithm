function solution(n) {
    var answer = 0;
    let sp = n.split(" ");
    if(sp[1] == '+'){
        answer = Number(sp[0]) + Number(sp[2]);
    }
    else if(sp[1] == '-'){
        answer = sp[0] - sp[2];
    }
    else answer = sp[0] * sp[2];
    
    return answer;
}