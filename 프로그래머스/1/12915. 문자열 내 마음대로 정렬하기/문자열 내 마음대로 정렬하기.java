import java.util.Arrays;

public class Solution {
    public String[] solution(String[] strings, int n) {
        String[] answer = {};
        Arrays.sort(strings,(s1,s2) ->{
            char a = s1.charAt(n);
            char b = s2.charAt(n);
            int result = Character.compare(a,b);
            if(result == 0){
                return s1.compareTo(s2);
            }
            return result;
        } );
        return strings;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        //String[] strings = {"sun","bed","car"};
        String[] strings = {"abce", "abcd", "cdx"}; int n = 2;
        //int n = 1;
        System.out.println(Arrays.toString(sol.solution(strings,n)));

    }
}
