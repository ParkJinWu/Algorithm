function solution(num_list) {
    let num1 = num_list.reduce((acc,val) => acc * val);
    let num2 = num_list.reduce((acc,val) => (acc+val));
    
    return num1 > num2*num2 ? 0 : 1;
}