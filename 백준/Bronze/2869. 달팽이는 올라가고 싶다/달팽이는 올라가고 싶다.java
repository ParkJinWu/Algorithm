import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer token = new StringTokenizer(br.readLine()," ");
        int A = Integer.parseInt(token.nextToken());
        int B = Integer.parseInt(token.nextToken());
        int V = Integer.parseInt(token.nextToken());

        int days = (V-B) / (A-B);

        //System.out.println((float) (V-B) / (A-B));

        if((V-B) % (A-B) == 0){
            System.out.println(days);
        }else {
            System.out.println(days+1);
        }
    }
}
