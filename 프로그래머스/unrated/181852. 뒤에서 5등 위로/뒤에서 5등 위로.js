function solution(num_list) {
    var answer = num_list.sort((a,b) => a-b);  // sort() 함수는 요소들을 문자열로 취급
    return answer.slice(5,answer[answer-1]);
}