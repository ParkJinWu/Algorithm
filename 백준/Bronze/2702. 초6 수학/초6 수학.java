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
            token = new StringTokenizer(br.readLine());
            int A = Integer.parseInt(token.nextToken());
            int B = Integer.parseInt(token.nextToken());
            int lcm = A / gcd(A,B) * B / gcd(A,B)* gcd(A,B);
            //최소공배수 : 두 개 이상의 수가 공통적으로 가지는 배수 중에서 가장 작은 수
            System.out.println(lcm+ " " + gcd(A,B) );

        }
    }

    public static int gcd(int a, int b){
        if(b == 0) return a;
        return gcd(b,a%b);
    }
}
