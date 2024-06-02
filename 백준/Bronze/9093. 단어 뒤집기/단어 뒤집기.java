import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for(int i = 0 ; i < T ; i++){
            String line[] = br.readLine().split(" ");

            StringBuilder result = new StringBuilder();
            //System.out.println(Arrays.toString(line));

            for(int j = 0 ; j < line.length ; j++){
                StringBuilder rev = new StringBuilder(line[j]);
                result.append(rev.reverse()).append(" ");
            }
            System.out.println(result);
        }

    }
}
