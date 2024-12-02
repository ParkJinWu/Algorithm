import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static long[][] dp = new long[30][30] ;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringTokenizer token;
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < T; i++) {
            token = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(token.nextToken());
            int M = Integer.parseInt(token.nextToken());

            long c = getConbine(M,N);
            sb.append(c).append("\n");
        }

        System.out.println(sb);
    }

    public static long getConbine(int n, int m){
        // 초기값 세팅
        for (int i = 0; i < 30; i++) {
            dp[i][0] = 1;
            dp[i][i] = 1;
        }

        for (int N = 1; N < 30 ; N++){
            for (int M = 1; M < N; M++) {
                dp[N][M] = dp[N -1][M -1] + dp[N -1][M];
            }
        }
        return dp[n][m];
    }
}
