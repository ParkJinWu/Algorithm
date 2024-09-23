public class Solution {
    public String solution(int a, int b) {
        String[] days = {"FRI", "SAT", "SUN", "MON", "TUE", "WED", "THU"};
        int[] months = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 30};

        int total = 0;

        for(int i = 0 ; i < a - 1 ; i++){
            total += months[i];
        }

        total += b - 1 ;

        return days[total % 7];
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int a = 5; int b = 24;
        System.out.println(sol.solution(a,b));

    }
}
