import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.math.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer token = new StringTokenizer(br.readLine());
        long A = Long.parseLong(token.nextToken());
        long B = Long.parseLong(token.nextToken());

        System.out.println(Math.abs(A-B));
    }
}
