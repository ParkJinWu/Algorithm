import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int M = Integer.parseInt(br.readLine());
        int N = Integer.parseInt(br.readLine());
        int min = N;
        int sum = 0;

        for(int i = M ; i <= N ; i++){
            if(isPrime(i)){
                if(min > i){
                    min = i;
                }
                sum+=i;
            }
        }

        if(sum != 0){
            System.out.println(sum);
            System.out.println(min);
        }else {
            System.out.println(-1);
        }
    }

    public static boolean isPrime(int n){
        if(n <= 1) return false;
        if(n == 2) return true;
        if(n % 2 == 0) return false;

        for(int i = 3 ; i < n ; i+=2){
            if(n % i == 0) return false;
        }
        return true;
    }
}
