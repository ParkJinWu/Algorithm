import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());
        StringTokenizer token ;

        for(int i = 0 ; i < T ; i++){
            token = new StringTokenizer(br.readLine()," ");
            int H = Integer.parseInt(token.nextToken());
            int W = Integer.parseInt(token.nextToken());
            int N = Integer.parseInt(token.nextToken());

            int floor = N % H ;
            int room = N / H + 1;


            if(floor == 0){
                floor = H;
                room-=1;
            }
            
            sb.append(floor * 100 + room).append('\n');
        }

        System.out.print(sb);
    }
}
