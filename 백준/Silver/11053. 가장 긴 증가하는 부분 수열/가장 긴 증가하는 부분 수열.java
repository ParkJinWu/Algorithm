import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;


// Silver2 : 가장 긴 증가하는 부분 수열
public class Main {
    static int[] dp;
    static int[] A;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        A = new int[N]; // 입력 배열
        dp = new int[N]; // DP 배열
        Arrays.fill(dp,1);

        StringTokenizer token = new StringTokenizer(br.readLine());
        // 입력 배열 초기화
        for (int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(token.nextToken());
        }

        getSequence();
        System.out.println(Arrays.stream(dp).max().getAsInt());
    }

    public static void getSequence(){
        for (int i = 1; i < dp.length; i++) {
            for (int j = 0; j < i; j++) {
                if(A[i] > A[j]){
                    dp[i] = Math.max(dp[i],dp[j]+1);
                }
            }
        }
    }
}
