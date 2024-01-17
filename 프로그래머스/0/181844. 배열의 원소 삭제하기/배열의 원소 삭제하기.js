function solution(arr, delArr) {
    return arr.filter((el) => !delArr.includes(el));
}