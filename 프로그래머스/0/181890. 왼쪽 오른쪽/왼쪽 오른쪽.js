function solution(li) {
    var answer = [];
    let idxOfL = li.indexOf('l'); 
    let idxOfR = li.indexOf('r');
   
    if(idxOfL < 0 && idxOfR < 0 ) return [];
    
    if(idxOfR >= 0 && idxOfL === -1){
        return li.slice(idxOfR+1);
    }
    else if(idxOfR === -1 && idxOfL >= 0){
        return li.slice(0,idxOfL);
    }
    
    if(idxOfL < idxOfR){
        return li.slice(0,idxOfL);
    }
    else if(idxOfL > idxOfR){
        return li.slice(idxOfR + 1);
    }
   
    return answer;
}