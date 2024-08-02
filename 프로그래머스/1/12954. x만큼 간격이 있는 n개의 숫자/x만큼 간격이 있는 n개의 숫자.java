import java.util.Arrays;

class Solution{
    public long[] solution(int x, int n) {
        long[] answer = new long[n];

        for (int i = 0; i <n ; i++) {
            answer[i] = (long) x * (i + 1);
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int x = 4;
        int n = 3;

//        int x = 2;
//        int n = 5;

        System.out.println(Arrays.toString(sol.solution(x,n)));
    }
}

