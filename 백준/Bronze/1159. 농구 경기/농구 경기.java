import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        int alphabet[] = new int[26];


        for(int i = 0 ; i < N ; i++){
            String str = br.readLine();
            char first = str.charAt(0);
            if(first >= 'a' && first <= 'z'){
                alphabet[(int)first-97]++;
            }
        }

        for(int i = 0 ; i < alphabet.length ; i++){
            if(alphabet[i] >= 5){
                sb.append((char)(i + 97));
            }
        }

        System.out.print(sb.length() == 0 ? "PREDAJA" : sb);
    }
}
