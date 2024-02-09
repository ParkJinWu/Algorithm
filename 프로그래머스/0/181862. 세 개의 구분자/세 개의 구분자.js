function solution(myStr) {
    var tmp = '';
    let answer = [];
    let s = ['a','b','c']
    let str = myStr.split('');
    for(i = 0 ; i < myStr.length ; i++){
       if(str[i] !== 'a'){
         if(str[i] !== 'b'){
            if(str[i] !== 'c' ){
                tmp+=str[i];
            }
            else tmp+= '_'
         }
            else tmp+= '_'
       }
         else tmp+='_'

    }
    
    tmp = tmp.split('_')
    for(x = 0 ; x < tmp.length ; x++){
        if(tmp[x] !== '') answer.push(tmp[x]);
    }
    
    
    
    return answer.length == 0 ? ['EMPTY'] : answer;
}