import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer token = new StringTokenizer(br.readLine());
        BigInteger P = new BigInteger(token.nextToken());
        int K = Integer.parseInt(token.nextToken());
        boolean isGood = true;

        for (int i = 2; i < K ; i++) {
            if(isPrime(i)){
                if (P.mod(BigInteger.valueOf(i)).equals(BigInteger.ZERO)) {
                    System.out.println("BAD " + i);
                    isGood = false;
                    break;
                }
            }
        }

        if(isGood) {
            System.out.println("GOOD");
        }
    }

    private static boolean isPrime(int n){
        if(n < 2) return false;
        if(n == 2) return true;

        for (int i = 2; i < n ; i++) {
            if(n % 2 == 0) return false;
        }
        return true;
    }
}
