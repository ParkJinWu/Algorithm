import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String S = br.readLine();
        String alphabet[] = new String[26];
        Arrays.fill(alphabet,"-1"); // -1로 초기화

        for (int i = 0 ; i < S.length() ; i++){
            int idx = S.charAt(i) - 97;
            char ch = S.charAt(i);
            alphabet[idx] = String.valueOf(S.indexOf(ch));
        }
        
        System.out.print(String.join(" ",alphabet));
    }
}
