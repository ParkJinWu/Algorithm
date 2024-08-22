public class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        int max = 0; int min = 0;
        for(int i = 0 ; i < sizes.length; i++){
            max = Math.max(max,Math.max(sizes[i][0],sizes[i][1]));
            min = Math.max(min,Math.min(sizes[i][0],sizes[i][1]));
        }
        return max * min;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int[][] sizes = {{60,50},{30,70},{60,30},{80,40}};
        System.out.println(sol.solution(sizes));
    }
}
