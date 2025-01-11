import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

// 평범한 배낭
// 각 물건은 무게 W와 가치 V를 가짐
// 물품의 수 : N, 버틸 수 있는 무게 K, 각 줄에 무게 W
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer token = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(token.nextToken()); // 물품의 수
        int K = Integer.parseInt(token.nextToken()); // 버틸 수 있는 무게

        int[][] dp = new int[N+1][K+1];
        int[][] knapsack = new int[N+1][2];


        // 물건 받기
        for (int i = 1; i <= N ; i++) {
            token = new StringTokenizer(br.readLine());
            int weight = Integer.parseInt(token.nextToken());
            int value = Integer.parseInt(token.nextToken());
            knapsack[i][0] = weight;
            knapsack[i][1] = value;
        }

        //dp 배열 채우기
        for(int i = 1 ; i <= N ; i++){ // i : 각 물건
            for (int w = 1; w <= K ; w++) { // w : 각 무게
                if(knapsack[i][0] <= w){ // 현재 물건을 넣을 수 있는 경우
                    // w - knapscak[i][0] + v[i]
                    dp[i][w] = Math.max(dp[i-1][w-knapsack[i][0]] + knapsack[i][1], dp[i-1][w]);
                }else { // 현재 물건을 넣을 수 없는 경우
                    dp[i][w] = dp[i-1][w];// 이전 최적해 그대로 가져옴
                }
            }
        }

//        for (int [] a : dp){
//            System.out.println(Arrays.toString(a));
//        }

        System.out.print(dp[N][K]);
    }
}
