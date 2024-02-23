function solution(a, b, c, d) {
    const arr =[a,b,c,d];
    
    //arr = new Set(arr);
    const maxNum = Math.max(a,b,c,d);
    const minNum = Math.min(a,b,c,d);
    
    let maxCount = 0; // 가장 큰 수의 공통 개수
    let minCount = 0; // 가장 작은 수의 공통 개수
    
    arr.forEach((el)=>{
        // 각각의 요소가 가장 큰 수랑 같으면 maxCount++
        if(el === maxNum){
            maxCount++;
        }
        // 각각의 요소가 가장 작은 수랑 같으면 minCount++
        else if(el === minNum){
            minCount++;
        }
    })
    console.log(maxCount);
    console.log(minCount);
    
    // 4개의 주사위 숫자가 모두 같을 때
    if(arr.every(el => el === a)){
        return 1111 * a;
    }
    
    // 3개의 주사위 숫자가 같을 때
    if(maxCount === 3){
      return (10 * maxNum + minNum)**2;  
    } 
    
    if(minCount === 3) {
     return (10 * minNum + maxNum)**2;   
    }

    // 2개씩 같은 값일 때
    if(maxCount === 2 && minCount === 2) {
        return (maxNum + minNum) * Math.abs(maxNum-minNum);
    }
    
    if(a === b){
        return c * d;
    }
    if(a === c){
        return b * d;
    }
    if(a === d){
        return b * c;
    }
    if(b === c){
        return a * d;
    }
    if(b === d){
        return a * c;
    }
    if(c === d){
        return a * b;
    }
    
    
    return minNum;
}