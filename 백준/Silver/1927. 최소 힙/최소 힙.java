import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.Queue;

// 최소 힙
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        Queue<Integer> pq = new PriorityQueue<>();
        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(br.readLine());

            if(num != 0){ // 0이 아니라면 큐에 넣는다.
                pq.offer(num);
            }else { // 0이라면 최솟값 출력 | 큐가 비어있다면 0 출력
                if(pq.isEmpty()){
                    System.out.println(0);
                }else {
                    System.out.println(pq.poll());
                }
            }
        }
    }
}
