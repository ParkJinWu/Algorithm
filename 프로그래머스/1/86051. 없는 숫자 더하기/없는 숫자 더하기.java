public class Solution {
    public int solution(int[] numbers) {
        int answer = 45;
        for (int number : numbers) {
            answer -= number;
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        //int[] numbers = {1,2,3,4,6,7,8,0};
        int[] numbers = {5,8,4,0,6,7,9};
        System.out.println(sol.solution(numbers));
    }

}
