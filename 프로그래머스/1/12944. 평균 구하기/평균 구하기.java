import java.util.Arrays;

class Solution {
    public double solution(int[] arr) {
        double answer = Arrays.
                stream(arr).
                average().
                orElse(0.0);
        System.out.println(answer);

        return answer;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        //int arr[] = {1,2,3,4};
        int arr[] = {5,5};
        sol.solution(arr);
    }
}

