import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[9];
        int sum = 0 ;

        for(int i = 0 ; i < arr.length ; i++){
            arr[i] = Integer.parseInt(br.readLine());
            sum += arr[i];
        }

        int fake1 = 0, fake2 = 0;

        for(int i = 0 ; i < arr.length-1 ; i++){
            for(int j = i+1 ; j < arr.length ; j++){
                if(arr[i] + arr[j] ==  sum - 100){
                    fake1 = arr[i];
                    fake2 = arr[j];
                }
            }
        }

        for(int n : arr) {
            if (n == fake1 || n == fake2) continue;
            System.out.println(n);
        }
    }
}
