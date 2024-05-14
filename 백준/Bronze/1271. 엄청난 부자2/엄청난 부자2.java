import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer token = new StringTokenizer(br.readLine());
        BigInteger N = new BigInteger(token.nextToken());
        BigInteger M = new BigInteger(token.nextToken());

        System.out.println(N.divide(M));
        System.out.print(N.remainder(M));
    }
}
