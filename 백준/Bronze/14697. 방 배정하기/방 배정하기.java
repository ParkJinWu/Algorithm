import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer token = new StringTokenizer(br.readLine());
        int answer = 0;

        int A = Integer.parseInt(token.nextToken());
        int B = Integer.parseInt(token.nextToken());
        int C = Integer.parseInt(token.nextToken());
        int N = Integer.parseInt(token.nextToken());

        for(int i = 0 ; i <= N / A ; i++ ){
            for(int j = 0 ; j <= N / B ; j++){
                for(int k = 0 ; k <= N / C ; k++){
                    if(i * A + j * B + k * C == N){
                        answer = 1;
                    }
                }
            }
        }

        System.out.println(answer);
    }
}
