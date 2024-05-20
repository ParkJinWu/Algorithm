import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer token ;

        int C = Integer.parseInt(br.readLine());

        for(int i = 0 ; i < C ; i++){
            token = new StringTokenizer(br.readLine(), " ");
            int N = Integer.parseInt(token.nextToken());
            int[] arr = new int[N];
            for(int j = 0 ; j < N ; j++){
                arr[j] = Integer.parseInt(token.nextToken());
            }

            Double avg = Arrays.stream(arr).average().getAsDouble(); //평균
            int cnt = 0;

            for(int k = 0 ; k < N ; k++){
                if(arr[k] > avg) cnt++;
            }
            System.out.printf("%.3f%%\n",(float) cnt/N * 100);

        }


    }
}
