import java.util.Scanner;

// 이친수
// 1 : 0으로 시작 X
// 2 : 1이 2번 연속 X
// 전에 끝 자리에서 1이면 1개 0이면 2개?
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        // dp[i][j] = i -> 자리수
        //            j -> 끝나는 수
        long[][] dp = new long[N+1][2];

        // 1자리 수 초기화
        dp[1][0] = 0;
        dp[1][1] = 1;

        // 2자리 수 ~ N자리 수
        for (int i = 2; i <= N ; i++) {
            // 0이면 0,1둘다 가능 == 이전 0값 +1
            // 1이면 0만 가능 == 이전 0값
            dp[i][0] = dp[i-1][0] + dp[i-1][1];
            dp[i][1] = dp[i-1][0];
        }

        System.out.println(dp[N][0] + dp[N][1]);
        sc.close();
    }
}
