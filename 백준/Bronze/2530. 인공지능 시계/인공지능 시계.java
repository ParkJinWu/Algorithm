import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer token = new StringTokenizer(br.readLine()," ");
        int A = Integer.parseInt(token.nextToken());
        int B = Integer.parseInt(token.nextToken());
        int C = Integer.parseInt(token.nextToken());
        int cooking_time = Integer.parseInt(br.readLine());

        int time = time = A * 3600 + B * 60 + C + cooking_time; // 현재 시각 분 -> 초로 변환

        A = (time / 3600) % 24; // 시
        B = (time % 3600) / 60; // 분
        C = time % 60; // 초

        System.out.println(A + " " + B + " " + C);
    }
}
