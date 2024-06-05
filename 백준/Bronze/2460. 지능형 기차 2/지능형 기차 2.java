import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer token;

        int max = 0 , now = 0;

        for(int i = 0 ; i < 10 ; i++){
            token = new StringTokenizer(br.readLine());
            int out = Integer.parseInt(token.nextToken());
            int in = Integer.parseInt(token.nextToken());

            now = now - out + in;
            if(max < now) max = now;
        }

        System.out.println(max);

    }
}
