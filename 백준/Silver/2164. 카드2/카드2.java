import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

//카드2
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        Queue<Integer> queue = new LinkedList<>();

        for(int i = 1; i <= N  ; i++){
            queue.offer(i);
        }

        while (queue.size() != 1){
            queue.poll(); // 제일 위에 있는 카드 제거
            int frontToBottom = queue.poll(); // 그 다음 카드 제거
            queue.offer(frontToBottom); // 제일 아래로 옮기기

        }

        System.out.println(queue.peek());
    }
}
