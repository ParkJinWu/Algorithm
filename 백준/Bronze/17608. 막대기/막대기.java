import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[] arr = new int[n];

        for(int i = 0 ; i < n ; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }

        int visibleCount = 1; // 마지막 막대기는 항상 보임
        int maxH = arr[n-1];

        for(int i = n - 2 ; i >= 0 ; i--){
            if(maxH < arr[i]){
                visibleCount++;
                maxH = arr[i];
            }
        }

        System.out.println(visibleCount);

    }
}
