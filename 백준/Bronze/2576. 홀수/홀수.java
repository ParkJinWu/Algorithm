import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int min = Integer.MAX_VALUE, sum = 0;
        int arr[] = new int[7];

        for(int i = 0 ; i < 7 ; i++){
            arr[i] = Integer.parseInt(br.readLine());
            if(arr[i] % 2 != 0){
                sum += arr[i];
                if(min > arr[i]) min = arr[i];
            }
        }

        min = sum == 0 ? -1 : min;

        if(min == -1){
            System.out.println(min);
        }else {
            System.out.println(sum+"\n"+min);
        }
    }
}
