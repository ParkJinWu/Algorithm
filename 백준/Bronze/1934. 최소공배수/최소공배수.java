import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer token;
        int T = Integer.parseInt(br.readLine());

        for(int i = 0 ; i < T ; i++){
            token = new StringTokenizer(br.readLine(), " ");
            int A = Integer.parseInt(token.nextToken());
            int B = Integer.parseInt(token.nextToken());

            int lcm = (A / gcd(A,B) * B / gcd(A,B)) * gcd(A,B);
            System.out.println(lcm);
        }

    }

    public static int gcd(int a, int b){
        int large = Math.max(a,b);
        int small = Math.min(a,b);

        if(small == 0 ) return large;

        return gcd(small,large % small);
    }
}
