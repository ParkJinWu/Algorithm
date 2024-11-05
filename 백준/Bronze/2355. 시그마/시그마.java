import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer token = new StringTokenizer(br.readLine());

        long A = Long.parseLong(token.nextToken());
        long B = Long.parseLong(token.nextToken());
        
        long min = Math.min(A,B);
        long max = Math.max(A,B);

        long n = max - min + 1 ;
        long result = n * (min+max) / 2;
        System.out.println(result);

    }
}
