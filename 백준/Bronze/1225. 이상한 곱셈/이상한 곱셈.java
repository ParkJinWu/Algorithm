import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer token = new StringTokenizer(br.readLine());

        char[] A = token.nextToken().toCharArray();
        char[] B = token.nextToken().toCharArray();

        long sum = 0;

        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < B.length; j++) {
                sum += (A[i] - '0') * (B[j] - '0');
            }
        }
        br.close();
        System.out.println(sum);
    }
}
