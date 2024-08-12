public class Solution {
    public String solution(String s) {
        String answer = "";
        int len = s.length();
        int mid = len / 2;
        if(len % 2 == 0){ // 짝수 길이
            return s.substring(mid-1,mid+1);
        }else{ // 홀수 길이
            return s.substring(mid,mid+1);
        }
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        //String s = "abcde";
        String s = "qwer";
        System.out.println(sol.solution(s));
    }
}
