import java.util.Arrays;

class Solution {
    public int[] solution(long n) {
        String numStr = Long.toString(n);

        char[] ch = numStr.toCharArray();

        int[] answer = new int[ch.length];
        int idx = 0;
        for (int i = ch.length - 1; i >= 0; i--) {
            answer[idx++] = ch[i] - '0';
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int n = 12345;

        System.out.println(Arrays.toString(sol.solution(n)));
    }
}

