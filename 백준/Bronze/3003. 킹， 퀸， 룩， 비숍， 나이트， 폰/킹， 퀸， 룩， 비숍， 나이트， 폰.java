import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer token = new StringTokenizer(br.readLine()," "); // 한줄로 입력받음 공백을 기준으로 나눠줌
        StringBuilder sb = new StringBuilder();
        int[] chess = {1,1,2,2,2,8};

        for(int i = 0 ; i < chess.length ; i++){
            int num = Integer.parseInt(token.nextToken());
            sb.append(chess[i] - num).append(" ");
        }

        System.out.println(sb);



    }
}
