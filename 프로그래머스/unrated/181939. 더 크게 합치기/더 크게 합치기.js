function solution(a, b) {
    let ab = ''+b+a;
    let ba = ''+a+b;
  
    return parseInt(ab) > parseInt(ba) ? parseInt(ab) : parseInt(ba);
}