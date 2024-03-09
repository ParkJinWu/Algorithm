function solution(num, total) {
    var answer = [];
    let start = parseInt(total/num) - parseInt(num/2);
    let end = parseInt(total/num) + parseInt(num/2);;
    if((num % 2 == 0)){
        for(let i = start+1; i <= end ; i++){
         answer.push(i);
        }
    }else{
        for(let i = start; i <= end ; i++){
            answer.push(i);
        }
    }
    return answer;
}