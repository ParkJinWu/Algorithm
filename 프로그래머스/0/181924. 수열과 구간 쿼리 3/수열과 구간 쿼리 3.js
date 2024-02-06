function solution(arr, queries) {
    var answer = [...arr];
    for(i = 0 ; i < queries.length ; i++){
        const tmp = answer[queries[i][0]];
        answer[queries[i][0]] = answer[queries[i][1]];
        answer[queries[i][1]] = tmp; 
    }
    return answer;
}