function solution(arr) {
    var answer = [...arr];
    for (i=0;i<arr.length;i++){
        !(i%2) ? answer[i] = answer[i].toLowerCase() : answer[i] = answer[i].toUpperCase();
       
    }
    return answer;
}