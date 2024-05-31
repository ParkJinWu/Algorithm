import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer token = new StringTokenizer(br.readLine()," ");
        int N = Integer.parseInt(token.nextToken());
        int B = Integer.parseInt(token.nextToken());


        StringBuilder sb = new StringBuilder();

        while (N > 0){
            int remain = N % B ;
            int share = N/B;

            if(remain < 10){
                sb.append(remain);
            }else {
                sb.append((char) (remain + 55));
            }
            N = share;
        }
        System.out.println(sb.reverse());
    }
}
