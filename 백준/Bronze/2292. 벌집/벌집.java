import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int cnt = 1;
        int layer = 1;

        while (N > layer){
            layer += cnt * 6;
            cnt++;
        }

        System.out.println(cnt);
        

    }
}
