import java.util.Scanner;

/*
* 연산 1: X가 3으로 나누어 떨어지면 3으로 나누기
* 연산 2: X가 2으로 나누어 떨어지면 2으로 나누기
* 연산 3: X -= 1
* */
public class Main {
    static int dp[] ;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int X = sc.nextInt();

        dp = new int[X+1];
        dp[0] = dp[1]= 0;

        for (int num = 2; num <=X ; num++) {
            // dp[i-1] + 1은 항상 가능한 연산 (1 빼기)
            dp[num] = dp[num - 1] + 1;

            // i가 2로 나누어 떨어지면 dp[i/2] + 1을 고려
            if (num % 2 == 0) {
                dp[num] = Math.min(dp[num], dp[num / 2] + 1);
            }

            // i가 3으로 나누어 떨어지면 dp[i/3] + 1을 고려
            if (num % 3 == 0) {
                dp[num] = Math.min(dp[num], dp[num / 3] + 1);
            }
        }

        System.out.println(dp[X]);
    }
}
