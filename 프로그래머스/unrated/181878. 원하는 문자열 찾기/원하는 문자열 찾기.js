// function solution(myString, pat) {
//     var answer = 0;
//     let strUpper = myString.toUpperCase();
//     let patUpper = pat.toUpperCase();
//     console.log( myString.toUpperCase().includes(pat.toUpperCase()));
//     return answer;
// }

const solution = (myString,pat) => myString.toUpperCase().includes(pat.toUpperCase()) ? 1 : 0