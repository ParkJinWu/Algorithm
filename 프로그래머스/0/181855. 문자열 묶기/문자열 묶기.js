function solution(strArr) {
    const dict = {};
      
    for(x of strArr){
         dict[x.length] = dict[x.length] ?? [];
         dict[x.length].push(x);
    }
    
    const values = Object.values(dict).map(a => a.length);
    

    
    return Math.max(...values);
}