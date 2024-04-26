function solution(numbers) {
    var answer = 0;
    const arr = [1,2,3,4,5,6,7,8,9];
    arr.forEach(el => {
        if(!numbers.includes(el)) answer += el
    })
    return answer;
}