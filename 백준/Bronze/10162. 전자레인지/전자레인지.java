import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());

        int time[] = {300,60,10};
        
        if(T % 10 != 0 ){
            System.out.println(-1);
        }else {
            for(int i = 0 ; i < time.length ; i++){
                sb.append(T / time[i] + " ");
                T %= time[i];
            }
        }

        System.out.print(sb);
    }
}
