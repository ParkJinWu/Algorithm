import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt(); // 테스트 케이스 개수
        
        for (int t = 0; t < T; t++) {
            int N = sc.nextInt(); // N번째 피보나치 수를 계산
            int[][] dp = new int[N + 1][2]; // dp[i][0]: 0의 개수, dp[i][1]: 1의 개수
            
            if (N >= 0) {
                dp[0][0] = 1; // 기본 경우: fib(0) = 0, 0의 개수는 1
                dp[0][1] = 0; // 기본 경우: fib(0) = 0, 1의 개수는 0
            }
            if (N >= 1) {
                dp[1][0] = 0; // 기본 경우: fib(1) = 1, 0의 개수는 0
                dp[1][1] = 1; // 기본 경우: fib(1) = 1, 1의 개수는 1
            }
            
            for (int i = 2; i <= N; i++) {
                dp[i][0] = dp[i - 1][0] + dp[i - 2][0]; // fib(i)의 0의 개수는 fib(i-1)의 0의 개수 + fib(i-2)의 0의 개수
                dp[i][1] = dp[i - 1][1] + dp[i - 2][1]; // fib(i)의 1의 개수는 fib(i-1)의 1의 개수 + fib(i-2)의 1의 개수
            }
            
            System.out.println(dp[N][0] + " " + dp[N][1]);
        }
        
        sc.close();
    }
}
