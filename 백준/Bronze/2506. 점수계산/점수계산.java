import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int cnt = 0 ;
        int score = 0 ;

        String[] arr = br.readLine().split(" ");

        for(int i = 0 ; i < N ; i++){
            int now = Integer.parseInt(arr[i]);
            if(now == 1){
                cnt++;
                score += cnt;
            }else {
                cnt = 0;
            }
        }

        System.out.println(score);


    }
}
