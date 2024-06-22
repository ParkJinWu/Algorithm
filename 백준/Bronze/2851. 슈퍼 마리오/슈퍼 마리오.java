import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int sum = 0;
        int close = 0 ;

        for(int i = 0 ; i < 10 ; i++){
            sum += Integer.parseInt(br.readLine());


            //더 가까운 값 업데이트
            if(Math.abs(100 - sum) <= Math.abs(100 - close)){
                close = sum;
            }
        }

        System.out.print(close);
    }
}
