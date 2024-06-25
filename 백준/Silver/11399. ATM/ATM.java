import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    // ATM
    // ATM은 총 1대
    // N명의 줄 (1~N)
    // 각 사람이 인출하는 데 걸리는 시간 배열 arr
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer token = new StringTokenizer(br.readLine());
        int[] arr = new int [N];

        for(int i = 0 ; i < N ; i++){
            arr[i] =  Integer.parseInt(token.nextToken());
        }

        Arrays.sort(arr);
        int sum = 0;

        for(int i = 0 ; i < N ; i++){
            for(int j = 0 ; j <= i ; j++){
                sum+= arr[j];
            }
        }

        System.out.println(sum);
    }
}
