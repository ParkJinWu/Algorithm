function solution(arr) {
    let answer = 0 ;
    let odd = arr.reduce((acc,value,idx) => {     
        if(value < 0) acc.push(idx);   
        return acc;
    },[])  
    answer = odd[0] >= 0 ? odd[0] : -1;
    return answer;
}