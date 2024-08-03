import java.util.*;

class Solution {
    public long solution(long n) {
        double sqrt = Math.sqrt(n); //제곱근 
        
        if(sqrt == (int)sqrt){ // 제곱이면
            return (long) Math.pow(sqrt+1,2); // 제곱이면 제곱근에 +1 하여 다시 제곱
        }else {
            // 제곱수가 아닌 경우 -1을 반환합니다.
            return -1;
        }
    }
}