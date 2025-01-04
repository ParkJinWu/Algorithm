import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

// 퇴사
// N + 1일까지 최대 수익 도출
public class Main {
    public static int getMaxRevenue(int[] T, int[] P, int N){
        int[] dp = new int[N+2];

        for (int i = 1; i <= N; i++) {
            // i = 상담이 진행되는 날
            // T[i] = 상담이 걸리는 일수
            // i + T[i] - 1 = 상담이 끝나는 날

            // 상담 진행 가능
            if(i+ T[i] - 1 <= N){ // 퇴사일 전에 끝난다면
                dp[i+ T[i]] = Math.max(dp[i] + P[i], dp[i + T[i]]);
            }

            // 상담 진행 불가
            dp[i+1] = Math.max(dp[i+1], dp[i]); // 이전 최대 수익을 다음 날로 미룬다

        }

        return dp[N+1];
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int[] days = new int[n+1];
        int[] pays = new int[n+1];

        for (int i = 1; i <= n; i++) {
            StringTokenizer token = new StringTokenizer(br.readLine());
            int day = Integer.parseInt(token.nextToken());
            int pay = Integer.parseInt(token.nextToken());

            days[i] = day;
            pays[i] = pay;
        }

        // 동적 계획법으로 최대 합을 저장?
        System.out.println(getMaxRevenue(days,pays,n));
    }
}
