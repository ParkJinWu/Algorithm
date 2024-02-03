function solution(arr, flag) {
    var a = [];
    for(i = 0 ; i< arr.length ; i++){
        if(flag[i])
        {
          a.push(...Array(arr[i]*2).fill(arr[i]));
        } 
        else
        {
          a = a.slice(0,-arr[i]);  
        }
        
    }
   
    return a;
}