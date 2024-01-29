function solution(date1, date2) {
    var answer = 0;
    let [y1,m1,d1] = date1;
    let [y2,m2,d2] = date2;
    
    if(y1 !== y2) return y1 < y2 ? 1 : 0 ;
    if(m1 !== m2) return m1 < m2 ? 1 : 0 ;
    if(d1 !== d2) return d1 < d2 ? 1 : 0 ;
     
    return answer ;
    }
    

    
   
        
    
  
