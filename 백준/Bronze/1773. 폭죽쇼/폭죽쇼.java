import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer token = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(token.nextToken());
        int C = Integer.parseInt(token.nextToken());

        int[] arr = new int[C];

        for(int i = 0 ; i<N ; i++){
            int num = Integer.parseInt(br.readLine());

            for(int j = num; j <= C ; j+=num){
                arr[j-1]++;
            }
        }

        long cnt = Arrays.stream(arr).filter(el -> el > 0).count(); //count()메서드의 반환 값은 long

        System.out.print(cnt);



    }
}
