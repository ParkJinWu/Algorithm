import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer token;
        int N = Integer.parseInt(br.readLine());
        int arr[] = new int[N];

        token = new StringTokenizer(br.readLine(), " ");
        for(int i = 0 ; i < N ; i++){
            arr[i] = Integer.parseInt(token.nextToken());
        }

        token = new StringTokenizer(br.readLine(), " ");
        int general = Integer.parseInt(token.nextToken());
        int sub = Integer.parseInt(token.nextToken());
        long cnt = N; // 총 감독관은 각 시험장마다 1명씩 무조건 있어햐 하기 때문

        for(int i = 0 ; i < arr.length; i++){
            arr[i] -= general;
           if(arr[i] > 0){
               cnt += arr[i] % sub == 0 ? arr[i] / sub : arr[i] / sub +1;
           }
        }
        System.out.println(cnt);
    }
}





