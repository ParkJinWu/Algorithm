function solution(part, comp) {
    var answer = '';
    const hash = new Map();
    
    part.forEach(name => {
        if(hash.has(name)){
            hash.set(name,hash.get(name)+1);
        }else{
            hash.set(name,1);
        }
    });
    
    comp.forEach(name => {
        if(hash.has(name)){
            hash.set(name,hash.get(name)-1)
        }
    })
    
    for(let [k,v] of hash){
        if(v) answer+=k;
    }
    return answer;
}