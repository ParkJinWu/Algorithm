import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        while (N % 2 == 0){
                System.out.println(2);
                N /= 2;
        }

        for (int i = 3; i < N ; i++){
            while (N % i == 0){
                System.out.println(i);
                N /= i;
            }
        }

        if(N > 2) System.out.println(N);
    }
}
