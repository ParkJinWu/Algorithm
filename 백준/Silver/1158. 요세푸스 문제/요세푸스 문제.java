import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

//요세푸스 문제
//1~N명의 사람들이 원형을 이루고 있으며, (N,K)일 때 K번째 사람을 차례대로 1명이 남을 때 까지 제거
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer token = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(token.nextToken());
        int K = Integer.parseInt(token.nextToken());

        Queue<Integer> queue = new LinkedList<>();
        for(int i = 1; i <= N ; i++){
            queue.offer(i);
        }

        sb.append("<");
        while (queue.size() > 1){
            //0 ~ K-1번째 사람 제거 후 큐 뒤에 넣기
            for(int i = 1 ; i < K ; i++){
                queue.offer(queue.poll());
            }
            sb.append(queue.poll()).append(", ");
        }
        sb.append(queue.poll()).append(">");

        br.close();
        System.out.println(sb.toString());

    }
}
