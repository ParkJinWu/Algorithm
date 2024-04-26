function solution(phone_number) {
    var answer = '';
    const a = phone_number.slice(0,phone_number.length-4);
    const b = phone_number.slice(phone_number.length-4);
 
    return '*'.repeat(a.length) + b;
}