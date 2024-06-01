import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer token = new StringTokenizer(br.readLine());

        int A = Integer.parseInt(token.nextToken());
        int B = Integer.parseInt(token.nextToken());
        int[] arr = new int[B];
        int idx =0, sum = 0;

        for(int i = 1 ; i <= B ; i++){
            for(int j = 1 ; j <=i ; j++){
                if(idx == B) break;
                arr[idx] = i;
                idx++;
            }
        }
        
        for(int i = A - 1 ; i <= B-1 ;i++){
            sum+= arr[i];
        }

        System.out.println(sum);

    }
}
