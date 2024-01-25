function solution(a, b, c) {
    var answer = 0;
    let aa = Math.pow(a,2);
    let bb = Math.pow(b,2);
    let cc = Math.pow(c,2);
    
    if(a == b && a== c){
        answer = (a+b+c) * (aa+bb+cc) * (aa*a + bb*b + cc*c);
    }
    else if(a != b && a!= c && b!=c){
        answer = a+b+c;
    }
    else answer = (a+b+c) * (aa+bb+cc);
    
    return answer;
}