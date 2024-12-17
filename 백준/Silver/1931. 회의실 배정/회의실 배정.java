import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

/*
- 회의실 배정
- Input : 회의 시작시간 회의 종료시간
- Output : 겹치지 않으면서 사용할 수 있는 최대의 회의실의 수
* */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[][] meetings = new int[N][2]; // [][시작 시간, 종료 시간]

        for (int i = 0; i < N; i++) {
            StringTokenizer token = new StringTokenizer(br.readLine());
            int start_time = Integer.parseInt(token.nextToken()); // 회의 시작시간
            int end_time = Integer.parseInt(token.nextToken()); // 회의 종료시간

            meetings[i][0] = start_time;
            meetings[i][1] = end_time;
        }

        // 회의 시간 정렬
        Arrays.sort(meetings,(a,b) -> {
            if(a[1] == b[1]){
                return Integer.compare(a[0],b[0]);
            }
            return Integer.compare(a[1],b[1]);
        });

        int count = 0;
        int endTime = 0;

        for (int[] meet : meetings){
            if(meet[0] >= endTime){ // 겹치지 않는 경우
                count++;
                endTime = meet[1]; // 종료 시간 업데이트
            }
        }

        System.out.println(count);


    }
}
