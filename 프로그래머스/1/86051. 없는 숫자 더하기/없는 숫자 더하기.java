import java.util.*;

class Solution {
    public int solution(int[] numbers) {
        int answer = -1;
        int arr[] = {0,1,2,3,4,5,6,7,8,9};
        int sum = 0;
        
        for(int n : arr){
            boolean found = Arrays.stream(numbers).anyMatch(i -> i == n);
            if(!found) sum += n;
        }
        
        return sum;
    }
}