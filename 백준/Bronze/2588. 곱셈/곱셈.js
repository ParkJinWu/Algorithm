const fs = require('fs');
const inputData = fs.readFileSync(0,'utf8').toString().split("\n")
const A = parseInt(inputData[0]) ; // 숫자
const B = inputData[1] ; //array를 하기 위해 문자열로 둠.
const strArr = Array.from(B); // array로 만듦

const result3 = A * parseInt(strArr[2]); // strArr를 숫자로 만들어 계산함
const result4= A * parseInt(strArr[1]);
const result5 = A * parseInt(strArr[0]);
const result = A * B ;

console.log(`${result3}\n${result4}\n${result5}\n${result}`);