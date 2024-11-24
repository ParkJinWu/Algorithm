import java.util.Scanner;

public class Main {
    static boolean[] dp;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        dp = new boolean[N+1];
        dp(N);
        System.out.println(dp[N] ? "SK" : "CY");
    }

    private static boolean dp(int n){
        dp[1] = true;
        if(n >= 2) dp[2] = false;
        if(n >= 3) dp[3] = true;
        if(n >= 4) dp[4] = false;

        for (int i = 5; i <= n ; i++) {
            dp[i] = !dp[i-1] || !dp[i-3];
        }

        return dp[n];
    }
}
