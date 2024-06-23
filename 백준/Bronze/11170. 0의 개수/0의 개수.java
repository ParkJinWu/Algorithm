import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer token;
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());

        for(int i = 0 ; i < T ; i++){
            token = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(token.nextToken());
            int M = Integer.parseInt(token.nextToken());

            int count = 0;
            for(int num = N ; num <= M ; num++){
                count += zeroCnt(num);
            }
            System.out.println(count);

        }
    }

    public static int zeroCnt(int num){
        if(num == 0) return 1;

        int cnt = 0;

        while (num > 0){
            if(num % 10 == 0){
                cnt++;
            }
            num/=10;
        }
        return cnt;
    }
}
