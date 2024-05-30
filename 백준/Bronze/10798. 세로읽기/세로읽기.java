import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int max_len = Integer.MIN_VALUE;
        char[][] arr = new char[5][15];
        String result = "";



        for(int i = 0 ; i < 5 ; i++){
            String str = br.readLine();
            if(str.length() > max_len) max_len = str.length();

            for(int j = 0 ; j < str.length() ; j++){
                arr[i][j] = str.charAt(j);
            }
        }


        for(int i = 0 ; i < max_len ; i++){
            for(int j = 0 ; j < 5 ; j++){
                if(arr[j][i] == '\0') continue;
                System.out.print(arr[j][i]);

            }
        }
    }
}
