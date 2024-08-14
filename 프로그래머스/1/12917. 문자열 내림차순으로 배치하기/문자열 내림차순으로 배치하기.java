import java.util.Arrays;

public class Solution {
    public String solution(String s) {
        String answer = "";
        char[] c = s.toCharArray();
        Arrays.sort(c);
        StringBuilder sb = new StringBuilder(new String(c));
        answer = sb.reverse().toString();

        return answer;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        String s = "Zbcdefg";

        System.out.println(sol.solution(s));
    }

}
