function solution(arr) {
    var answer = [];
    let result = [];
    //let num = arr.findIndex((el) => el == 2);
    //let idx = arr.lastIndexOf(2);
    
    for (i = 0 ; i < arr.length ; i++){
        if(arr[i] == 2) answer.push(i);
    }

    result = arr.slice(answer[0],answer[answer.length-1]+1) ;

   
    return result.length == 0 ? [-1] : result;
}