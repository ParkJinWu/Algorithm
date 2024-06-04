import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int flag = 0;

        for(int i = 0 ; i < N ; i++){
            int opnion = Integer.parseInt(br.readLine());
            if(opnion == 1) flag++;
            else flag--;
        }

        System.out.print(flag > 0 ? "Junhee is cute!" :"Junhee is not cute!");
    }
}
