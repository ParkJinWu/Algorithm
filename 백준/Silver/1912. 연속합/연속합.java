import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

// 연속 합
// n개의 정수로 이루어진 임의의 수열에서 몇개를 선택하여, 최대 합을 만든다.
// 연속된 값을 선택해야 하기 때문에, 현재까지의 연속합에 현재 값을 더한 값과 현재 값만을 비교하여 더 큰 값을 선택
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[] seq = new int [n];
        int[] dp = new int[n];
        StringTokenizer token = new StringTokenizer(br.readLine());

        for (int i = 0; i < n; i++) {
            seq[i] = Integer.parseInt(token.nextToken());
        }

        // dp 배열 초기화
        dp[0] = seq[0];

        for (int i = 1; i < n; i++) {
            dp[i] = Math.max(dp[i-1]+seq[i], seq[i]);
        }

        int max = Arrays.stream(dp).max().getAsInt();

        System.out.println(max);
    }
}
