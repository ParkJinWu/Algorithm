function solution(id_pw, db) {
    var answer = '';
    const id = id_pw[0];
    const pw = id_pw[1];
    
    let idChk = false;
    let pwChk = false;
    
    for(let i = 0 ; i < db.length ; i++){
        if(db[i][0] === id && db[i][1] === pw){
            console.log("@");
            idChk = true;
            pwChk = true;
            return 'login';
        }
        
        if(id === db[i][0]){
            idChk = true;
            if(pw === db[i][1]) pwChk = true; 
        }
    }
        
 
    answer = (idChk && !pwChk) ?  'wrong pw' :  'fail';
    
    return answer;

}