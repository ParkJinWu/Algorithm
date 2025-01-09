import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

// RGB 거리
// 연속해서 같은 색 X
// 모든집을 칠하는 최소 비용
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine()); // 집의 수 N
        int[][] cost = new int[N][3]; // 색칠 비용
        int[][] dp = new int[N][3]; // 최소값 저장 dp 배열
        StringTokenizer token;

        for (int i = 0; i < N; i++) {
            token = new StringTokenizer(br.readLine());
            int R = Integer.parseInt(token.nextToken()); // RED
            int G = Integer.parseInt(token.nextToken()); // GREEN
            int B = Integer.parseInt(token.nextToken()); // BLUE

            cost[i][0] = R;
            cost[i][1] = G;
            cost[i][2] = B;
        }

        // 첫 번째 집의 비용을 초기값으로 설정
        dp[0][0] = cost[0][0];  // 빨강
        dp[0][1] = cost[0][1];  // 초록
        dp[0][2] = cost[0][2];  // 파랑


        for (int i = 1; i < N; i++) { // 두번 째 집부터 마지막 집까지
            int selectRed = Math.min(dp[i-1][1],dp[i-1][2]) + cost[i][0];  // R 선택 시 G,B 중 최솟값
            int selectGreen = Math.min(dp[i-1][0],dp[i-1][2]) + cost[i][1];  // G 선택 시 R,B 중 최솟값
            int selectBlue = Math.min(dp[i-1][0],dp[i-1][1]) + cost[i][2];  // B 선택 시 R,G 중 최솟값

            dp[i][0] = selectRed;
            dp[i][1] = selectGreen;
            dp[i][2] = selectBlue;
        }

        System.out.println(Math.min(dp[N-1][0],Math.min(dp[N-1][1], dp[N-1][2])));

    }
}

// R  G  B
// 26 40 83
// 49 60 57
// 13 89 99

/*
* dp[i][j] > i : 현재 집의 번호, j : 색(0 : R, 1 : G, 2 : B)
** 1번째 집 : 26, 40, 83
** 2번째 집
* ㄴ> R > min(40,83) = 40 + 49 = 89
* ㄴ> G > min(26,83) = 26 + 60 = 86
* ㄴ> B > min(26,40) = 26 + 57 = 83
*
dp[2][R] = 89
dp[2][G] = 86
dp[2][B] = 83
*
* * 3번째 집
 * ㄴ> R > min(86,83) = 83 + 13 = 96
 * ㄴ> G > min(89,83) = 83 + 89 = 172
 * ㄴ> B > min(89,86) = 86 + 99 = 185
* */