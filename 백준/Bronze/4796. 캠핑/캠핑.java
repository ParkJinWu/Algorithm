import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int idx = 1 ;

        while (true){
            StringTokenizer token = new StringTokenizer(br.readLine());
            int L = Integer.parseInt(token.nextToken());
            int P = Integer.parseInt(token.nextToken());
            int V = Integer.parseInt(token.nextToken());

            if (L == 0 && P == 0 && V == 0) break;

            int result = (V/P) * L + Math.min((V%P),L);

            sb.append("Case " + idx + ": " + result + "\n");
            idx++;
        }
        System.out.print(sb);
    }
}
