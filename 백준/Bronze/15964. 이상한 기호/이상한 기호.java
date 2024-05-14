import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer token = new StringTokenizer(br.readLine());

        Long A = Long.parseLong(token.nextToken());
        Long B = Long.parseLong(token.nextToken());

        System.out.println((A+B)*(A-B));
    }
}
