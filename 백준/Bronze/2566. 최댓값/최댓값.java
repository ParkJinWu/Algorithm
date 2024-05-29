import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer token ;
        int arr[][] = new int[9][9];
        int max_value = Integer.MIN_VALUE;
        int x = 0, y = 0;

        for(int i = 0 ; i < 9 ; i++){
            token = new StringTokenizer(br.readLine() ," ");
            for(int j = 0; j < 9 ; j++){
                arr[i][j] = Integer.parseInt(token.nextToken());

                if(max_value < arr[i][j]){
                    max_value = arr[i][j];
                    x = i+1;
                    y = j+1;
                }
            }
        }

        System.out.println(max_value);
        System.out.println(x + " " + y);

    }
}
