function solution(arr) {
    var answer = [[]];
    let row = arr.length;
    let col = arr[0].length;
    
    // if(row > col){
    //     for(let i = 0 ; i < arr.length ; i++){
    //         if(arr[i].length < arr.length){
    //         arr[i].push(0);
    //         }
    //     }
    // }
     if(row > col){
        for(let i = col ; i < row ; i++){
            for(let j = 0 ; j <row; j++){
                arr[j].push(0);
            }
        }
    }
    else if(col > row){
        for(let i = row ; i < col; i++){
            arr.push(new Array(col).fill(0));
        }
    }

    return arr;
}


