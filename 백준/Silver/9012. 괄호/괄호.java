import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    static Stack<Character> stack;
    static StringTokenizer token;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());



        for (int i = 0; i < T; i++) {
            token = new StringTokenizer(br.readLine());
            stack = new Stack<>();

            char[] line = token.nextToken().toCharArray();
            for (int j = 0; j < line.length; j++) {
                if(!stack.isEmpty() && stack.peek() != line[j]){
                    if(stack.peek() == ')' && line[j] == '('){
                        stack.push(line[j]);
                    }
                    stack.pop();
                }else {
                    stack.push(line[j]);
                }
            }
            if(stack.size() == 0){
                sb.append("YES").append("\n");
            }else {
                sb.append("NO").append("\n");
            }
        }

        System.out.println(sb.toString().trim());
    }
}
