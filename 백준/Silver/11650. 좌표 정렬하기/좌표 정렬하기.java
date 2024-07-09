import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        int[][] arr = new int[N][2];

        for(int i = 0 ; i < N ; i++){
            StringTokenizer token = new StringTokenizer(br.readLine());
            int A = Integer.parseInt(token.nextToken());
            int B = Integer.parseInt(token.nextToken());
            arr[i][0] = A;
            arr[i][1] = B;
        }

        Arrays.sort(arr,(a,b) -> {
            if(a[0] == b[0]){
                return a[1] - b[1]; //같다면 y를 기준으로 오름차순
            }else {
                return a[0] - b[0]; //오름차순
            }
        });

        for(int i = 0; i < N ; i++){
            sb.append(arr[i][0]).append(" ").append(arr[i][1]).append("\n");
        }

        System.out.println(sb.toString());
    }
}
