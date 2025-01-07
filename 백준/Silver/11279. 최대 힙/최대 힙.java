import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

// 최대
// 0 입력 시 최대 값 출 후 제거
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(Comparator.reverseOrder()); // 내림차순 정렬
        StringBuilder sb = new StringBuilder(); // 출력 문자열

        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();

            if(x == 0){ // 최대 값 출력 후 제거
                if(!priorityQueue.isEmpty()){
                    sb.append(priorityQueue.poll()).append("\n");
                }else {
                    sb.append("0").append("\n");
                }
            }else { // 삽입
                priorityQueue.offer(x);
            }
        }

        System.out.println(sb);

    }
}
