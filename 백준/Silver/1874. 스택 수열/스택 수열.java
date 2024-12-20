import java.util.Scanner;
import java.util.Stack;

// 스택 수열
public class Main {
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        // 수열 초기화
        int[] seq = new int[n];

        for (int i = 0; i < n; i++) {
            seq[i] = sc.nextInt();
        }

        System.out.println(is_seq(seq,n) ? sb : "NO");
    }

    public static boolean is_seq(int[] sequence, int n){
        Stack<Integer> stack = new Stack<>();
        int current_num = 1; int idx = 0;

        while (current_num <= n || !stack.isEmpty()){

            if (!stack.isEmpty() && stack.peek() > sequence[idx]) {
                return false;
            }

            // push :
            if (stack.isEmpty() || stack.peek() != sequence[idx]) {
                stack.push(current_num++);
                sb.append("+").append("\n");
            }

            //pop
            if(!stack.isEmpty() && stack.peek() == sequence[idx]){
                stack.pop();
                sb.append("-").append("\n");
                idx++;
            }
        }
            return true;
    }

}
