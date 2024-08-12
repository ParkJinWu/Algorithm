public class Solution {
    public String solution(int n) {
        String answer = "";
        answer += "수박".repeat(n/2) + (n % 2 == 1 ? "수":"");
        return answer;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int n = 3;
        System.out.println(sol.solution(n));
    }
}
