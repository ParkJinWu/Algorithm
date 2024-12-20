import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

// dp[0] = [30]
// dp[1] = [23, 21]
// dp[2] = [20, 13, 10]
// dp[3] = [7, 12, 10, 10]
// dp[4] = [4, 5, 2, 6, 5]
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        // 삼각형 초기화
        int[][] triangle = new int[n][]; // 각 행의 크기가 다르므로 2차원 배열의 각 행을 동적으로 초기화

        for (int i = 0; i < n; i++) {
            StringTokenizer token = new StringTokenizer(br.readLine());
            triangle[i] = new int[token.countTokens()];
            for (int j = 0; j < triangle[i].length; j++) {
                triangle[i][j] = Integer.parseInt(token.nextToken());
            }
        }

        int[][] dp = new int[n][];
        // 마지막 줄 복사
        dp[n-1] = triangle[n-1].clone();

        //dp 채우기
        for (int i = n-2; i >= 0 ; i--) {
            dp[i] = new int[i + 1];
            for (int j = 0; j <= i ; j++) {
                dp[i][j] = triangle[i][j] + Math.max(dp[i+1][j],dp[i+1][j+1]);
            }
        }

        System.out.println(dp[0][0]);


    }
}
