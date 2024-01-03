function solution(num_list, n) {
    var answer = num_list.find((v) => v === n );
    return answer === n ? 1 :0 ;
}