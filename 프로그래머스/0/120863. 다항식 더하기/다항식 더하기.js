function solution(polynomial) {
    var answer = '';
    let splitArr = polynomial.split(' + ');
    let xCnt = 0;
    let num = 0 ;
    
    for(let i = 0 ; i < splitArr.length ; i++){
        let el = splitArr[i];
        
        if(el.includes('x')){
            const idx = el.indexOf('x');
            const n = el.slice(0,idx);
            xCnt+= !n ? 1 : Number(n);
     
        }else{ // x 미포함
            num+=Number(el);
        } 
    }
    console.log("xCnt : " + xCnt);
    console.log("num : " + num);
    
    
    
    // x항과 상수 둘 다 있는경우
    if(xCnt && num){
        xCnt = xCnt < 2 ? '' : xCnt;
        return xCnt+'x + '+num;  
    }else{
        if(xCnt){ // x항만
             xCnt = xCnt < 2 ? '' : xCnt;
            return xCnt + 'x';
        }else{ // 상수항만
            return num +'';
        }  
    }
}