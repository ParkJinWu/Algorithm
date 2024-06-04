import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int idx = 0;
        StringTokenizer token;
        int max = Integer.MIN_VALUE;


        for(int i = 1 ; i <= 5 ; i++){
            int sum = 0;
            token = new StringTokenizer(br.readLine());
            for(int j = 1 ; j <= 4 ; j++ ){
                sum += Integer.parseInt(token.nextToken());
            }
            if(sum > max){
                max = sum;
                idx = i;
            }
        }

        System.out.print(idx + " " + max);
    }
}
