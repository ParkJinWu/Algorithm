import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer token = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(token.nextToken());
        int b = Integer.parseInt(token.nextToken());
        int measure = 0 ;

        if(n == 2){
            measure = gcd(a,b);
            for(int i = 1 ; i <= measure ; i++){
                if(measure % i == 0){
                    System.out.println(i);
                }
            }

        }else{
            int c = Integer.parseInt(token.nextToken());
            measure = gcd(gcd(a,b),c);

            for(int i = 1 ; i <= measure ; i++){
                if(measure % i == 0){
                    System.out.println(i);
                }
            }
        }

    }

    public static int gcd(int a, int b){
        if(b == 0) return a;

        return gcd(b,a % b);
    }
}
