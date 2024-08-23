public class Solution {
    public String solution(String s, int n) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if(Character.isUpperCase(c)){
                char shift = (char)((c - 'A' + n) % 26 + 'A');
                sb.append(shift);
            }else if(Character.isLowerCase(c)){
                char shift = (char) ((c - 'a' + n) % 26 + 'a');
                sb.append(shift);
            }else {//문자 아닌것
                sb.append(c);
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        //String s = "AB";
        //String s = "Z";
        String s = "a B z"; int n =4;
        //int n = 1;
        System.out.println(sol.solution(s,n));
    }
}
