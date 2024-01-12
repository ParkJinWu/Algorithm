function solution(num_list) {
    let even = 0 ;
    let odd = 0;
    num_list.map((e,i) => {
        !(i % 2) ? even += e : odd += e;
    });
    return even > odd ? even : odd;
}