import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer token = new StringTokenizer(br.readLine());
        int[] arr = new int[5];

        int number = 0 ;

        for(int i = 0 ; i < 5 ; i++){
            arr[i] = Integer.parseInt(token.nextToken());
        }

        while (true){
            int cnt = 0; // 개수는 각 수 마다 초기화
            number++; // 배수는 계속해서 증가
            for(int i = 0 ; i < 5 ; i++){
                if(number % arr[i] == 0){
                    cnt++;
                }
            }

            if(cnt >= 3) break;
        }
        System.out.println(number);


    }
}
