function solution(n, slicer, arr) {
    var answer = [];
    const [a,b,c] = slicer;
    
    switch(n){
        case 1:
            return arr.slice(0,b+1);
            break;
        case 2:
            return arr.slice(a);
            break;
        case 3:
            return arr.slice(a,b+1);
            break;
        case 4:
            for(i = a ; i <= b ; i+=c){
                answer.push(arr[i]);
            }
            break;
    }
    return answer;
}
