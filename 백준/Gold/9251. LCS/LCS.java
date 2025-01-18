import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

// LCS(최장 공통 수열)
public class Main {
    static int[][] dp;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        char[] S1 = br.readLine().toCharArray();
        char[] S2 = br.readLine().toCharArray();

        dp = new int[S1.length + 1][S2.length + 1];

        // DP Table 생성
        for (int i = 1; i <= S1.length; i++) {
            for (int j = 1; j <= S2.length; j++) {
                // == -> 왼쪽 대각선 위 + 1
                if(S1[i - 1] == S2[j - 1]){
                    dp[i][j] = dp[i-1][j-1] + 1;
                }else { // != -> max(왼쪽, 위)
                    dp[i][j] = Math.max(dp[i-1][j],dp[i][j-1]);
                }
            }
        }

        System.out.println(dp[S1.length][S2.length]);


    }
}
