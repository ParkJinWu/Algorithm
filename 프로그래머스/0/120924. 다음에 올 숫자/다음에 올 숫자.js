function solution(common) {
    var answer = 0;
    let arr = [];
    
    for(let i = 0 ; i < common.length-1 ; i++){
        let n = common[i+1] - common[i];
        arr.push(n);
       
    }
    let arrS = [...new Set(arr)];
    const len = arrS.length; 
    
   
    if(len === 1){ // arithmetic == 등차
        return common[common.length-1] + arrS[0];
    }else{ //geometric == 등비
        let geom = common[1] / common[0];
        return common[common.length-1] * geom;
    }
    return answer;
}