function solution(n)
{
    let str = ''+n
    var answer = 0;
    
    for(let i = 0 ; i < str.length ; i++){
        answer += Number(str[i]);
    }

    return answer;
}