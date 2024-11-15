import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer token = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(token.nextToken());
        int m = Integer.parseInt(token.nextToken());
        int M = Integer.parseInt(token.nextToken());
        int T = Integer.parseInt(token.nextToken());
        int R = Integer.parseInt(token.nextToken());


        if (m + T > M) { // 운동 불가능한 경우
            System.out.println(-1);
            return;
        }

        int pulse = m; // 초기 맥박
        int time = 0; // 총 소요 시간
        int exerciseTime = 0; // 실제 운동 시간

        while (exerciseTime < N){
            if(pulse + T <= M){ // 운동
                pulse += T;
                exerciseTime++;
            }else { // 휴식
                pulse = Math.max(pulse - R, m);
            }
            time++;
        }
        System.out.println(time);
    }
}
