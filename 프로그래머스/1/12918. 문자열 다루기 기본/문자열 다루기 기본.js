function solution(s) {
    if(s.length !== 4 && s.length != 6) return false;
    //s.search(/^[0-9]+$/)
    return s.search(/^[0-9]+$/) == -1 ? false : true;
}