import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

// 프린터 큐
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer token;

        int T = Integer.parseInt(br.readLine());

        while (T-- > 0){
            Queue<int []> queue = new LinkedList<>(); // 중요도 큐
            PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder()); // 우선순위가 높은 숫자가 먼저 나옴 (큰 숫자)
            
            token = new StringTokenizer(br.readLine());

            int N = Integer.parseInt(token.nextToken()); // 문서의 개수
            int M = Integer.parseInt(token.nextToken()); // 타겟 인덱스

            token = new StringTokenizer(br.readLine()); // 2


            for (int i = 0; i < N; i++) { // i == index
                int importance = Integer.parseInt(token.nextToken()); // 중요도
                queue.offer(new int[] {i,importance});
                pq.offer(importance);
            }


            int cnt = 0 ; // 순서 체크 변수

            while (!queue.isEmpty()){
                int[] current = queue.poll();

                if(current[1] == pq.peek()){ // 현재 문서가 최고 중요도를 가진 문서라면
                    pq.poll();
                    cnt++;

                    if(M == current[0]){
                        System.out.println(cnt);
                        break;
                    }
                }else {
                    queue.offer(current);
                }
            }
        }
    }
}
