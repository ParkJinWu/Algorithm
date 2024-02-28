function solution(n) {
    const arr = [];
    for(let i = 0 ; i <= 1000 ; i ++){
        const nn = i.toString().split('');
        if(i % 3 !== 0 && !nn.includes('3')) arr.push(i);
    }
    
    return arr[n-1];
}