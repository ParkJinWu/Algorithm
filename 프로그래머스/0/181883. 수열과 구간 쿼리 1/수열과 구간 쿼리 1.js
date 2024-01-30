function solution(arr, queries) {
    
    queries.map(rows => {
        for(i = rows[0] ; i<=rows[1]; i++){
                arr[i] +=1;
        }
    })

   return arr;
}