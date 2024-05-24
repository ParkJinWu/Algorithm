import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer token = new StringTokenizer(br.readLine(), " ");
        long A = Integer.parseInt(token.nextToken());
        long B = Integer.parseInt(token.nextToken());
        long C = Integer.parseInt(token.nextToken());
        int cnt = -1;

        if(C > B){
            int i = 0;
            while (true){
                i++;
                long TC = A + (B * i);
                long sales = C * i;
                if(TC<sales){
                    cnt = i;
                    break;
                }

            }
        }
        System.out.println(cnt);


    }
}
