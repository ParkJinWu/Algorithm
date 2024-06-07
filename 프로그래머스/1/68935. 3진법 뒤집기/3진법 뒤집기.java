import java.util.*;

class Solution {
    public int solution(int n) {
        int answer = 0;
        String base3 = Integer.toString(n,3);
        //StringBuilder sb = new StringBuilder(base3);
        //int result = Integer.parseInt(sb.reverse().toString());
        
        
        for(int i = 0 ; i < base3.length() ; i++){
            int num = (int)base3.charAt(i) - '0';
            answer += num * Math.pow(3,i);
        }
        
        return answer;
    }
}