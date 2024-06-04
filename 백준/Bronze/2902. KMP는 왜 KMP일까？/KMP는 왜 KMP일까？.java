import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str[] = br.readLine().split("-");
        StringBuilder sb = new StringBuilder();

        for(int i = 0 ; i < str.length ; i++){
            char ch = str[i].charAt(0);
            sb.append(ch);
        }
        System.out.print(sb);
    }
}
