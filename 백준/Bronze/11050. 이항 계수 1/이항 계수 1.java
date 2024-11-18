import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer token = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(token.nextToken());
        int K = Integer.parseInt(token.nextToken());


        int result = factorial(N) / (factorial(K) * factorial(N - K));
        System.out.println(result);

    }

    private static int factorial(int n){
        if(n == 1) return 1;

        int result = 1;
        for (int i = 1; i <= n ; i++) {
            result*=i;
        }

        return result;
    }
}
