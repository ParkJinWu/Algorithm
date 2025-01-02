import java.util.Arrays;
import java.util.Scanner;

// 쉬운 계단 수
// 계단수란 ? : 각 자리의 숫자가 0부터 9까지 차례로 하나씩만 감소하거나 증가하는 수
// ex) 12, 21
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int MOD = 1_000_000_000;

        int N = sc.nextInt();
        long[][] dp = new long[N+1][10];

        // 초기화: 1자리 계단 수는 1로 초기화 (단, 0 제외)
        for (int i = 1; i <= 9; i++) {
            dp[1][i] = 1;
        }

        // dp[i][j] == i -> 자릿수, j -> 맨 뒷자리
        for (int i = 2; i <= N; i++) {
            for (int j = 0; j <= 9 ; j++) {
                if (j == 0) {
                    dp[i][j] = dp[i - 1][1] % MOD;
                } else if (j == 9) {
                    dp[i][j] = dp[i - 1][8] % MOD;
                } else {
                    dp[i][j] = (dp[i - 1][j - 1] + dp[i - 1][j + 1]) % MOD;
                }
            }
        }

        // 결과 계산
        long result = 0;
        for (int i = 0; i <= 9; i++) {
            result = (result + dp[N][i]) % MOD;
        }

        System.out.println(result);
    }
}
