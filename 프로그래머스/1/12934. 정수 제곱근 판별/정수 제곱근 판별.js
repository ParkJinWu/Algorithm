function solution(n) {
    const sqrt = Math.sqrt(n);
    const pow = Math.pow(sqrt,2);
    return Number.isInteger(sqrt)? Math.pow(sqrt+1,2) : -1;
}