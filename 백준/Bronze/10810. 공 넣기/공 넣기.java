import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer token = new StringTokenizer(br.readLine()," ");

        int N = Integer.parseInt(token.nextToken());
        int M = Integer.parseInt(token.nextToken());

        int[] basket = new int[N];

        for (int idx = 0 ; idx < M ; idx++){
            token = new StringTokenizer(br.readLine()," ");
            int i = Integer.parseInt(token.nextToken());
            int j = Integer.parseInt(token.nextToken());
            int k = Integer.parseInt(token.nextToken());

            for(int x = i-1 ; x < j ; x++){ //인덱스가 0부터 시작하므로 -1
                basket[x] = k;
            }
        }

        for (int ball : basket){
            System.out.print(ball+" ");
        }
    }
}
