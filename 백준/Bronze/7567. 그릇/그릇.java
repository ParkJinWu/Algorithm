import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        char[] plate = br.readLine().toCharArray();
        int height = 10;

        for(int i = 1 ; i < plate.length ; i++){
            char now = plate[i];
            char prev = plate[i-1];
            if(now == prev){
                height += 5;
            }else {
                height += 10;
            }
        }

        System.out.println(height);

    }
}
