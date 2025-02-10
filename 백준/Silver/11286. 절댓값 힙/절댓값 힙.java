import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

// 절대값 힙
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());

        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>((a,b) -> {
           int absA = Math.abs(a);
           int absB = Math.abs(b);

           if(absA == absB) return Integer.compare(a,b);

           return Integer.compare(absA,absB);
        });

        for (int i = 0; i < N; i++) {
            int number = Integer.parseInt(br.readLine());

            if(number == 0){ // 출력
                sb.append(priorityQueue.isEmpty() ? 0 : priorityQueue.poll()).append("\n");
            }else { // 삽입
                priorityQueue.offer(number);
            }
        }
        System.out.println(sb.toString());
    }
}
