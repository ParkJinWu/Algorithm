// 백준 : 다이얼
const str = require('fs').readFileSync('/dev/stdin').toString().trim().split('');

// 다이얼 숫자에 맞게 알파벳 : 다이얼 형태의 객체를 생성
const alphabets = {
    ABC: 3,
    DEF: 4,
    GHI: 5,
    JKL: 6,
    MNO: 7,
    PQRS: 8,
    TUV: 9,
    WXYZ: 10,
  }
// 최종 반환값 
let minTime = 0;

for(let i = 0 ; i < str.length ; i++){ //입력된 알파벳만큼 반복
    for(let dic in alphabets){ // 객체를 순회하기 위해 for in문 사용
        if(dic.includes(str[i])){ // 객체의 각 요소에 접근하면서 includes() 메서드를 사용하여 알파벳이 존재하는 지 확인  
            minTime+=alphabets[dic]; // 존재한다면 해당 요소의 value를 더해줌 
        }

    }
}
console.log(minTime);
