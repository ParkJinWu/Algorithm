function solution(sizes) {
    var answer = 0;
    let width = []; // 가로
    let height = []; // 세로
    
    for(let i = 0 ; i < sizes.length ; i++){
        let w = Math.max(sizes[i][0],sizes[i][1]);
        let h = Math.min(sizes[i][0],sizes[i][1]);
        width.push(w);
        height.push(h);
    }
    
    
    return Math.max(...width) * Math.max(...height);
}