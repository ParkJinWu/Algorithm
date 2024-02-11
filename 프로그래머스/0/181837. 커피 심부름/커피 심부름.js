function solution(order) {
    var answer = 0;
    
    for(el of order){
        el.includes('americano') ? answer+=4500 :  el === 'anything' ? answer+=4500 : answer+=5000
    }

    return answer;
}