import java.util.Arrays;

public class Solution {
    public String solution(String s) {
        StringBuilder sb= new StringBuilder();
        int index = 0;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(c == ' '){
                sb.append(c);
                index = 0; //인덱스 초기화
            }else {
                if(index % 2 == 0){ // 짝수
                    sb.append(Character.toUpperCase(c));
                }else { // 홀수
                    sb.append(Character.toLowerCase(c));
                }
                index++;
            }

        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        String s = "try hello world";
        System.out.println(sol.solution(s));
    }
}
