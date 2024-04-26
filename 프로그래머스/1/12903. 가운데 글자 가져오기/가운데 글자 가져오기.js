function solution(s) {
    var answer = '';
    let mid = Math.trunc(s.length/2);
    
    if(s.length % 2 == 1){
        return s[mid];
    }

    return s[mid-1]+s[mid];
}