function solution(num_list) {
    var answer = 0;
    let even = num_list.filter(num_list => num_list % 2 == 0 );
    let odd = num_list.filter(num_list => num_list % 2 == 1 );
    
    answer = parseInt(even.join('')) + parseInt(odd.join('') );
    return answer;
}