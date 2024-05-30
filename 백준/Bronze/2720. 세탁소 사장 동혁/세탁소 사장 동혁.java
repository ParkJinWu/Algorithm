import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        int[] coins = {25, 10, 5, 1};

        for(int i = 0 ; i < T ; i++){
            int cost = Integer.parseInt(br.readLine());
            int arr[] = new int[4];

            for(int j = 0 ; j < coins.length ; j++){
                arr[j] = cost / coins[j];
                cost %= coins[j];
            }

            for(int cnt : arr){
                System.out.print(cnt + " ");
            }
        }

    }
}


