// 프로그래머스 안전지대 (js)
function solution(board) {
    var answer = 0;
    //let arr = board;
    const arr = Array.from(Array(board.length), () => Array(board.length).fill(0));
    //let bombCnt = 0;
    
    const dir = [[-1,-1],[-1,1],[1,-1],[1,1],[0,-1],[0,1],[-1,0],[1,0]];
    
    for(let i = 0 ; i < arr.length ; i++){
        for(let j = 0 ; j < arr.length ; j++){
            if(board[i][j] === 1){
                //bombCnt++;
                arr[i][j] =  1;
                dir.forEach((el) => {
                    let [x,y] = [i + el[0], j + el[1]];
                    if(x >= 0 && y >= 0 && x < arr.length && y < arr.length){
                        //arr.push(x,y);
                        arr[x][y] = 1;
                        //console.log(x,y);
                    }
                
                })
            }
        }
    }
    
    
    let zeroCnt = 0;
    for (let x = 0; x < arr.length; x++) {
        for (let y = 0; y < arr.length; y++) {
            if (arr[x][y] === 0) {
                zeroCnt++
            }
        }
       console.log(arr);
  }
    //console.log("arr : " + arr);
    //console.log("1의 개수 : "  + bombCnt);
    //console.log("Safe Zone : " + zeroCnt - bombCnt);
    //answer = zeroCnt - bombCnt;
    return zeroCnt;
}

//console.log(solution([[0, 0, 0, 0, 0], [0, 0, 0, 0, 0], [0, 0, 0, 0, 0], [0, 0, 1, 1, 0], [0, 0, 0, 0, 0]]));
console.log(solution([[1, 1, 1, 1, 1, 1], [1, 1, 1, 1, 1, 1], [1, 1, 1, 1, 1, 1], [1, 1, 1, 1, 1, 1], [1, 1, 1, 1, 1, 1], [1, 1, 1, 1, 1, 1]]));
