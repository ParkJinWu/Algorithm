import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int M = Integer.parseInt(br.readLine());
        int N = Integer.parseInt(br.readLine());
        int sum = 0 , min = Integer.MAX_VALUE;

        for(int i = 0 ; i <= N ; i++){
            int pow = (int) Math.pow(i,2);
            if(pow >= M && pow <=N){
                sum += pow;
                if(min > pow) min = pow;
            }
        }

        if(sum == 0) System.out.print(-1);
        else System.out.print(sum + "\n" + min);


    }
}
