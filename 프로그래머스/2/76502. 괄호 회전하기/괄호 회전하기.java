import java.util.*;

class Solution {
    public int solution(String s) {
        int answer = 0;
        for(int i = 0 ; i < s.length(); i++){
            Stack<Character> stack = new Stack<>();
            String str = rotate(s,i);
            //System.out.println("\nRotated String: " + str);
            for(int j = 0 ; j < str.length(); j++){
                char ch = str.charAt(j);
                
                 if (stack.isEmpty()) {
                    stack.push(ch);
                } else if (ch == ']' && stack.peek() == '[') {
                    stack.pop();
                } else if (ch == '}' && stack.peek() == '{') {
                    stack.pop();
                } else if (ch == ')' && stack.peek() == '(') {
                    stack.pop();
                } else {
                    stack.push(ch);
                }
            }
            // 회전된 문자열 처리가 끝난 후 스택의 상태를 출력
            //System.out.println("Stack after processing rotated string '" + str + "'➡️" + stack);
            
        if(stack.isEmpty()){
            answer++;
            }
        }
        
        
        return answer;
    }
    
    public static String rotate(String str, int n){
        String left = str.substring(0,n);
        String right = str.substring(n);
        return right + left ;
    }
}