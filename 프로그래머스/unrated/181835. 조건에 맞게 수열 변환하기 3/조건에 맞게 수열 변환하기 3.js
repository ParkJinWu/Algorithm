function solution(arr, k) {
    return arr.map((element) => k % 2 == 0 ? element + k : element * k );
}