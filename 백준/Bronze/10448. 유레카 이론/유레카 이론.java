import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[45];

        for (int i = 1 ; i < 45 ;i++){
            arr[i] = (i * (i+1)) / 2;
        }

        StringBuilder result = new StringBuilder();

        for(int i = 0 ; i < N ;i++){
            int num = Integer.parseInt(br.readLine());
            result.append(isEureka(num,arr)).append("\n");
        }
        System.out.println(result.toString());


    }

    public static int isEureka(int n, int[] array){
        for(int i = 1 ; i < 45 ; i++){
            for(int j = 1 ; j < 45 ; j++){
                for(int k = 1; k < 45 ; k++){
                    if(array[i] + array[j] + array[k] == n){
                        return 1;
                    }
                }
            }

        }
        return 0;
    }
}
