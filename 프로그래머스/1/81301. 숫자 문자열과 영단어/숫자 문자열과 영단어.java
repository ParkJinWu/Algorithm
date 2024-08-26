public class Solution {
    public int solution(String s) {
        String[] arr = {"zero","one","two","three","four","five","six","seven","eight","nine"};
        for (int i = 0; i < arr.length; i++) {
            String num = arr[i];
            s = s.replace(num,Integer.toString(i));
        }
        return Integer.parseInt(s);
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        String s = "23four5six7";
        System.out.println(sol.solution(s));

    }
}
