function solution(str) {
    let answer = '';
    var tmp = str.toLowerCase();

    for(i of tmp){
        answer += i == 'a'  ? i.toUpperCase() : i.toLowerCase();
    }
    return answer;
}