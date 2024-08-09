import java.util.ArrayList;
import java.util.Arrays;

public class Solution {
    public int[] solution(int[] arr) {
        if (arr.length <= 1) return new int[]{ -1 };

        int[] answer = new int[arr.length-1];
        int min = Integer.MAX_VALUE;

        for (int n : arr) {
            if(n < min){
                min = n;
            }
        }

        int idx = 0;
        for (int n : arr){
            if(n != min){
                answer[idx++] = n;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int arr[] = {4,3,2,1};
        //int arr[] = {10};
        System.out.println(Arrays.toString(sol.solution(arr)));
    }
}
