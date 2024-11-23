import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer token = new StringTokenizer(br.readLine());

        int E = Integer.parseInt(token.nextToken());
        int S = Integer.parseInt(token.nextToken());
        int M = Integer.parseInt(token.nextToken());

        int year = 1;

        while (true){
            int e = year % 15 == 0 ? 15 : year % 15;
            int s = year % 28 == 0 ? 28 : year % 28;
            int m = year % 19 == 0 ? 19 : year % 19;

            if (e == E && s == S && m == M) {
                System.out.println(year);
                break;
            }
            year++;
        }
    }
}
