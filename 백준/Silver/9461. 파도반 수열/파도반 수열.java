import java.util.Scanner;

public class Main {
    static long[] dp = new long[101]; // long 자료형으로 변경

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt(); // 테스트 케이스 개수 입력

        setPadovan(); // Padovan 수열 미리 계산

        for (int i = 0; i < T; i++) {
            int N = sc.nextInt(); // N 입력
            System.out.println(dp[N]); // 결과 출력
        }
    }

    // Padovan 수열 계산 및 저장
    public static void setPadovan() {
        dp[1] = 1;
        dp[2] = 1;
        dp[3] = 1; // 초기 값 설정

        for (int i = 4; i <= 100; i++) {
            dp[i] = dp[i - 2] + dp[i - 3]; // 점화식
        }
    }
}
