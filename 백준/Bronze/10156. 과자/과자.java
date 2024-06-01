import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer token = new StringTokenizer(br.readLine());
        long K = Long.parseLong(token.nextToken());
        long N = Long.parseLong(token.nextToken());
        long M = Long.parseLong(token.nextToken());

        long money = (K * N - M) > 0 ? K * N - M : 0;

        System.out.println(money);
    }
}
