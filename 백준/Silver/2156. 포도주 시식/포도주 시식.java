import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 포도주 시식
// 연속 3번 마실 수 없다.
// 최대로 마실 수 있는 포도주의 양 도출
public class Main {

    // 최대로 마실 수 있는 포도주
    public static int getMaxDrink(int[] wine, int n){
        if(n == 1) return wine[0];
        if(n == 2) return wine[0] + wine[1];

        int[] dp = new int[n];

        dp[0] = wine[0];
        dp[1] = wine[0] + wine[1];
        dp[2] = Math.max(wine[0] + wine[1],Math.max(wine[0] + wine[2], wine[1] + wine[2]));

        for (int i = 3; i < n; i++) {
            int case1 = dp[i-1]; // X O O X
            int case2 = dp[i-2] + wine[i];// O O X O
            int case3 = dp[i-3] + wine[i-1] + wine[i];// O X O O
            dp[i] = Math.max(case1,Math.max(case2,case3));
        }
        return dp[n-1];
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[] wine = new int[n];

        for (int i = 0; i < n; i++) {
            wine[i] = Integer.parseInt(br.readLine());
        }
        System.out.println(getMaxDrink(wine,n));
    }
}
