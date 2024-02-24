function solution(n) {
    const arr = Array.from({length : n }, () => Array(n).fill(0));
    let num = 1; //1부터 시작
    let startRow = 0 , startCol = 0;
    let endRow = n-1 , endCol = n-1;
    
    //const direction = [[0,1],[1,0],[0,-1],[-1,0]];
    while(startCol <= endCol && startRow <= endRow){
        for(let i = startCol ; i <= endCol; i++){
            arr[startRow][i] = num;
            num++;
        }
        startRow++;
        
        for(let i = startRow ; i <= endRow ; i++){
            arr[i][endCol] = num;
            num++;
        }
        endCol--;
        
        for(let i = endCol; i>=startCol ; i--){
            arr[endRow][i] = num;
            num++;
        }
        endRow--;
        
        for(let i = endRow ; i >= startRow ; i--){
            arr[i][startCol] = num;
            num++;
        }
        startCol++;
        
    }
    
    
  
    
    
    console.log(arr);
    
    
    return arr;
}