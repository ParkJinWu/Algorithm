function solution(arr1, arr2) {
    if(arr1.length == arr2.length){
        let sameArr1 = arr1.reduce((a,v)=>a+v);
        let sameArr2 = arr2.reduce((a,v)=>a+v);
        if(sameArr1 > sameArr2) return 1;
        else if(sameArr1 == sameArr2) return 0;
        return -1;
    }
    else if (arr1.length < arr2.length) return -1;
    else if(arr1.length > arr2.length) return 1;
    else return 0;
    

}