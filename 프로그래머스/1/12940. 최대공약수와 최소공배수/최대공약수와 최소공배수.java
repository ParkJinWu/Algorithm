import java.util.Arrays;

public class Solution {
    public int[] solution(int n, int m) {
        int[] answer = {gcd(n,m),lcm(n,m)};

        return answer;
    }

    public static int gcd(int a, int b){
        int max = Math.max(a,b);
        int min = Math.min(a,b);

        if(min == 0) return max;

        return gcd(min, max % min);
    }

    public static int lcm(int a, int b){
        return a*b / gcd(a,b);
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int n = 3; int m = 12;
        System.out.println(Arrays.toString(sol.solution(n,m)));
    }
}
