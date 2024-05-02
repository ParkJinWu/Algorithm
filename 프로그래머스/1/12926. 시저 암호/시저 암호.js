function solution(s, n) {
    var answer = '';
    s.split('').forEach((x) => {
        if(x === ' ') answer += ' ';
        else {
            let unicode = x.charCodeAt();
            let newCode = unicode + n;
            console.log(newCode);
            if(unicode >= 65 && unicode <= 90){
                if(newCode > 90){
                      answer += String.fromCharCode(newCode-26);
                }else{
                      answer += String.fromCharCode(newCode);
                }
            }
            
            if(unicode >= 97 && unicode <= 122){
                if(newCode > 122){
                      answer += String.fromCharCode(newCode-26);
                }else{
                      answer += String.fromCharCode(newCode);
                }
            }
            
        
        }
    })
    return answer;
}