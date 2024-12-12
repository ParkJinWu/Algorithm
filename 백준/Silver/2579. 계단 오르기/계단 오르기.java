import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 계단 오르기
public class Main {
    static int[] dp ;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int[] score = new int[N+1];

        // 계단 점수 초기화
        for (int i = 1; i <= N; i++) {
            score[i] = Integer.parseInt(br.readLine());
        }

        if (N == 1) {
            System.out.println(score[1]);
            return;
        } else if (N == 2) {
            System.out.println(score[1] + score[2]);
            return;
        }

        dp = new int[N+1];

        dp[1] = score[1];
        dp[2] = score[1] + score[2];
        dp[3] = Math.max(score[1] + score[3] , score[2] + score[3]);


        for (int i = 4; i <= N; i++) {
            dp[i] = Math.max(dp[i-2] + score[i], dp[i-3] + score[i-1] + score[i]);
        }

        br.close();
        System.out.println(dp[N]);

    }
}
