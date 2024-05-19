import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());


        for(int i = 0 ; i < T ; i++){
            String OX = br.readLine();
            int cnt = 0 ;
            int score = 0 ;

            for(int j = 0 ; j < OX.length() ; j++){
                if(OX.charAt(j) == 'O'){
                    cnt++;
                    score += cnt;
                }else {
                    cnt = 0;
                }
            }
            sb.append(score).append("\n");
        }

        System.out.print(sb);
    }
}
