function solution(str, overwrite_string, s) {
    return str.slice(0,s)+overwrite_string+str.slice(s+overwrite_string.length);
}