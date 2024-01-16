function solution(str) {
    var answer = str.reduce((acc,el,i) => acc+=el);
    //console.log("@@"+typeof(Number(num_str)));
    return answer;
}