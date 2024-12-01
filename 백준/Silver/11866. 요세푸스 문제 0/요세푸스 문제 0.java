import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer token = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(token.nextToken());
        int K = Integer.parseInt(token.nextToken());

        Queue<Integer> queue = new LinkedList<>();

        for (int i = 1; i <= N; i++) {
            queue.offer(i);
        }

        int cnt = 0;

        while (!queue.isEmpty()){
            cnt++;
            if(cnt >= K){
                sb.append(queue.poll()).append(", ");
                cnt = 0;
            }else {
                queue.offer(queue.poll());
            }

        }

        sb.setLength(sb.length() - 2);
        System.out.println("<"+ sb + ">");
    }
}
