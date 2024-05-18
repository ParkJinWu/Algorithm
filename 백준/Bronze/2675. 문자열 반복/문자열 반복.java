import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringTokenizer token ;
        StringBuilder sb = new StringBuilder();

        for(int i = 0 ; i < T ; i++){
            token = new StringTokenizer(br.readLine(), " ");
            int R = Integer.parseInt(token.nextToken());
            String S = token.nextToken();
            for (int j = 0 ; j < S.length() ; j++){
                sb.append(Character.toString(S.charAt(j)).repeat(R));
            }
            sb.append("\n");
        }
        System.out.print(sb);
    }
}
