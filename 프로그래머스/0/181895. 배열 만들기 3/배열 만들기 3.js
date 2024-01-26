function solution(arr, intervals) {
    var answer = [];
    const [[a, b], [c, d]] = intervals;
    
    return [...arr.slice(a,b+1),...arr.slice(c,d+1)];
}