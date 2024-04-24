function solution(s){
    let obj = {'P' : 0 , "Y" : 0};
    
    let str = s.toUpperCase();
    
    for(let i = 0 ; i < str.length ; i++){
        obj[str[i]]++;
    }
    
    return obj['P'] === obj['Y'] ? true:false;
}
