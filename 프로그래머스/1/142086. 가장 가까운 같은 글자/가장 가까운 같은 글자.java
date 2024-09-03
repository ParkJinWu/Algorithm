import java.util.Arrays;

public class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        for(int i = 0; i < s.length() ; i++){
            int lastIdx = -1 ;
            for(int j = 0 ; j < i ; j++){
                if(s.charAt(i) == s.charAt(j)){
                    lastIdx = j ;
                }
            }
            answer[i] = lastIdx != -1 ?  i - lastIdx :  lastIdx;
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        //String s = "banana";
        String s = "foobar";
        System.out.println(Arrays.toString(sol.solution(s)));
    }
}
