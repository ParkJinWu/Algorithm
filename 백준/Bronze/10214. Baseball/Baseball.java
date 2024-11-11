import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer token;
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            int yonsei = 0;
            int korea = 0;

            for (int j = 0; j < 9; j++) {
                token = new StringTokenizer(br.readLine());
                int y = Integer.parseInt(token.nextToken());
                int k = Integer.parseInt(token.nextToken());

                yonsei+=y;
                korea+=k;
            }
            if(yonsei-korea > 0){
                sb.append("Yonsei").append("\n");
            }else if(yonsei-korea < 0) {
                sb.append("Korea").append("\n");
            }else {
                sb.append("Draw").append("\n");
            }
        }
        System.out.println(sb.toString());
    }

}
