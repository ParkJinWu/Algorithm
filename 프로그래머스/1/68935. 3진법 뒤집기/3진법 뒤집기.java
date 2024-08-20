public class Solution {
    public int solution(int n) {
        int answer = 0;
        StringBuilder sb = new StringBuilder(Integer.toString(n,3));
        answer = Integer.parseInt(sb.reverse().toString(),3);
        return answer;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int n = 45;
        System.out.println(sol.solution(n));
    }
}
