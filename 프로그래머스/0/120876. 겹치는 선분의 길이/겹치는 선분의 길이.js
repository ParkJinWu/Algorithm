// 프로그래머스 겹치는 선분 (js)

function solution(line){
    const [[l1,l2],[l3,l4],[l5,l6]] = line;
    const first = Math.min(l1,l3,l5);
    const end = Math.max(l2,l4,l6);
    const len = Math.abs(end-first);

    let arr = Array(len).fill(0);


    for ([a,b] of line){
        for(let i = a; i < b ; i++){
            arr[i-first]++;
        }
    }

    let answer = arr.filter((el) => el > 1).length;
    return answer;
}

//solution([[0, 2], [-3, -1], [-2, 1]]);
//solution([[-1, 1], [1, 3], [3, 9]]);
solution([[0, 5], [3, 9], [1, 10]]);