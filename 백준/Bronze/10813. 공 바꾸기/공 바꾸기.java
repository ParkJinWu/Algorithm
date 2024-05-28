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

        for(int i = 0 ; i < N ; i++){
            basket[i] = i+1;
        }

        //System.out.println(Arrays.toString(basket));

        for(int idx = 0 ; idx < M ; idx++){
            token = new StringTokenizer(br.readLine(), " ");
            int i = Integer.parseInt(token.nextToken());
            int j = Integer.parseInt(token.nextToken());

            int tmp = basket[i-1];
            basket[i-1] = basket[j-1];
            basket[j-1] = tmp;
        }

        for(int ball : basket){
            System.out.print(ball+" ");
        }
    }
}
