import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int A = Integer.parseInt(br.readLine());
        int B = Integer.parseInt(br.readLine());
        int C = Integer.parseInt(br.readLine());

        int[] arr = new int[10];
        Arrays.fill(arr,0);

        String num = String.valueOf(A * B * C);

        for(int i = 0 ; i < num.length() ; i++){
            int idx = num.charAt(i) - '0';
            arr[idx]++;
        }

        for (int x : arr){
            System.out.println(x);
        }
    }
}
