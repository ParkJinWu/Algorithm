import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer token = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(token.nextToken()); // 여자 수
        int M = Integer.parseInt(token.nextToken()); // 남자 수
        int K = Integer.parseInt(token.nextToken()); // 인턴쉽

        int cnt = 0;

        // 총인원(N+M) 중 인턴으로 나가고, 팀을 결성할 수 있는지(3)
        while (N >= 2 && M >= 1 && (N+M) - K >= 3){
            N -= 2;
            M -= 1;
            cnt++;
        }

        System.out.println(cnt);





    }
}
