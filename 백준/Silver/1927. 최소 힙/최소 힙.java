import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.Queue;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder(); // 출력 최적화

        int N = Integer.parseInt(br.readLine());
        Queue<Integer> pq = new PriorityQueue<>();

        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(br.readLine());

            if (num != 0) {
                pq.offer(num); // 0이 아니라면 큐에 추가
            } else {
                if (pq.isEmpty()) {
                    sb.append(0).append("\n"); // 큐가 비어 있으면 0 출력
                } else {
                    sb.append(pq.poll()).append("\n"); // 최솟값 출력
                }
            }
        }

        System.out.print(sb); // 최종 결과 한 번에 출력
    }
}
