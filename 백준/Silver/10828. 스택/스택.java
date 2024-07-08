import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

//스택
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer token;
        int TC = Integer.parseInt(br.readLine());
        Stack<Integer> stack = new Stack<>();

        for(int t = 0 ; t < TC ; t++){
            token = new StringTokenizer(br.readLine());
            String option = token.nextToken();

            switch (option){
                case "push":
                    stack.push(Integer.parseInt(token.nextToken()));
                    break;
                case "pop":
                    if(stack.isEmpty()){
                        System.out.println(-1);
                    }else{
                        System.out.println(stack.pop());
                    }
                    break;
                case "size":
                    System.out.println(stack.size());
                    break;
                case "empty":
                    System.out.println(stack.isEmpty() ? 1 : 0);
                    break;
                case "top":
                    if(stack.isEmpty()) System.out.println(-1);
                    else System.out.println(stack.peek());
                    break;

            }
        }
    }
}
