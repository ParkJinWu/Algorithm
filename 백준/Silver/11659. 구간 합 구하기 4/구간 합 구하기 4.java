import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

//구간 합 구하기 4
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer token = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(token.nextToken());
        int M = Integer.parseInt(token.nextToken());

        int[] arr = new int[N];
        int[] prefixSum = new int[N+1]; //누적합 배열 초기화

        token = new StringTokenizer(br.readLine());
        for(int i = 0 ; i < N ; i++){
            arr[i] = Integer.parseInt(token.nextToken());
            prefixSum[i+1] = arr[i] + prefixSum[i];
        }

        for(int i = 0 ; i < M ; i++){
            token = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(token.nextToken());
            int b = Integer.parseInt(token.nextToken());

            int sum = prefixSum[b] - prefixSum[a-1];
            sb.append(sum).append("\n");
        }
        System.out.println(sb.toString());
        br.close();



    }
}
