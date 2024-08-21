public class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        Long numP = Long.parseLong(p);
        for (int i = 0; i < t.length()-p.length() + 1; i++) {
            long n = Long.parseLong(t.substring(i,i+p.length()));
            if(numP >= n){
                answer++;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        //String t = "3141592"; String p = "271";
        String t = "500220839878"; String p = "7";
        //String t = "10203"; String p = "15";
        System.out.println(sol.solution(t,p));
    }
}
