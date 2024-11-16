import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer token = new StringTokenizer(br.readLine());

        BigInteger A = new BigInteger(token.nextToken(), 2);
        BigInteger B = new BigInteger(token.nextToken(), 2);

        BigInteger sum = A.add(B);

        System.out.println(sum.toString(2));
    }
}
