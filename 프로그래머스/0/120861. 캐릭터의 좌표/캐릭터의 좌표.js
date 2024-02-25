function solution(keyinput, board) {
    let x = 0 ,y = 0 ;
    let xRange = board[0]/2-1 , yRange = board[1]/2-1;
    
    keyinput.forEach((el, idx) => {
        if(el === 'left' && -x < xRange ) x-= 1;
        if(el === 'right' && x < xRange) x+= 1;
        if(el === 'up' && y < yRange) y+= 1;
        if(el === 'down'&& -y < yRange) y-= 1;
    })
 
      //console.log("xRange : " +xRange);
      //console.log("yRange : " +yRange);
    
    
    return [x,y];
}