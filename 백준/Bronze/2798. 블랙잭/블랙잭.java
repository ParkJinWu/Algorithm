import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer token = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(token.nextToken());
        int M = Integer.parseInt(token.nextToken());

        int[] arr = new int[N];

        token = new StringTokenizer(br.readLine(), " ");
        for(int i = 0 ; i < N ; i++){
            arr[i] = Integer.parseInt(token.nextToken());
        }

        int max = 0 ;

        for(int i = 0 ; i < N ; i++){
            for(int j = i+1 ; j < N ; j++){
                for(int k = j+1 ; k < N ; k++){
                    int tmp = arr[i] + arr[j] + arr[k];

                    if(max < tmp && M >= tmp){
                        max = tmp;
                    }

                }
            }
        }
        System.out.println(max);
    }
}
