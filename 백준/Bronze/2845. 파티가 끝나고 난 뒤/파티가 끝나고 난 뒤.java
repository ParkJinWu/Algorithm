import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer token = new StringTokenizer(br.readLine());


        int L = Integer.parseInt(token.nextToken());
        int P = Integer.parseInt(token.nextToken());

        int cnt = L * P;

        token = new StringTokenizer(br.readLine());
        for(int i =0 ; i<5 ; i++){
            sb.append(Integer.parseInt(token.nextToken()) - cnt).append(" ");
        }

        System.out.println(sb);
    }
}
