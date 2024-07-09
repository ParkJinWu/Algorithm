import java.util.Scanner;

//1,2,3 더하기
//정수가 주어졌을 때 1,2,3의 합으로 나타내는 방법의 수 출력
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        //n은 양수이며 11보다 작다.
        int[] dp = new int[11];

        dp[1] = 1;
        dp[2] = 2;
        dp[3] = 4;

        for(int i = 4 ; i <= 10 ; i++){
            dp[i] = dp[i-3] + dp[i-2] + dp[i-1];
        }

        for(int i = 0 ; i < T ; i++){
            int num = sc.nextInt();
            System.out.println(dp[num]);
        }
    }
}
