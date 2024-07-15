import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

//덱
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        Deque<Integer> deque = new ArrayDeque<>();
        for(int i = 0 ; i < N ; i++){
            StringTokenizer token = new StringTokenizer(br.readLine());
            String command = token.nextToken();

            switch (command){
                case "push_front":
                    deque.addFirst(Integer.parseInt(token.nextToken()));
                    break;
                case "push_back":
                    deque.addLast(Integer.parseInt(token.nextToken()));
                    break;
                case "pop_front":
                    if(!deque.isEmpty()){
                        int removed = deque.pollFirst();
                        sb.append(removed).append("\n");
                    }else {
                        sb.append(-1).append("\n");
                    }
                    break;
                case "pop_back":
                    if(!deque.isEmpty()){
                        int removed = deque.pollLast();
                        sb.append(removed).append("\n");
                    }else {
                        sb.append(-1).append("\n");
                    }
                    break;
                case "size":
                    sb.append(deque.size()).append("\n");
                    break;
                case "empty":
                    sb.append(deque.isEmpty() ? 1 : 0).append("\n");
                    break;
                case "front":
                    sb.append(!deque.isEmpty() ? deque.peekFirst() : -1).append("\n");
                    break;
                case "back":
                    sb.append(!deque.isEmpty() ? deque.peekLast() : -1).append("\n");
                    break;
            }
        }

        br.close();
        System.out.println(sb.toString().trim());


    }
}
