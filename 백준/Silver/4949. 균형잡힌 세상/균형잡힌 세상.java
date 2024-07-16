import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

//균형잡힌 세상
//각 줄마다 해당 문자열이 균형을 이루고 있으면 "yes"를, 아니면 "no"를 출력
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        while (true){
            String line = br.readLine();

            //입력의 종료조건
            if(line.equals(".")){
                break;
            }

            sb.append(isBalanced(line) ? "yes" : "no").append("\n");
        }

        System.out.println(sb.toString());

    }

    //균형을 이루고 있는지 판단하는 함수
    public static boolean isBalanced(String line){
        Stack<Character> stack = new Stack<>();

        for(char ch : line.toCharArray()){
            if(ch == '(' || ch == '['){
                stack.push(ch);
            } else if (ch == ')') {
                if(stack.isEmpty() || stack.pop() != '('){
                    return false;
                }
            } else if (ch == ']') {
                if(stack.isEmpty() || stack.pop() != '['){
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
