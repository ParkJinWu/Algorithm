import java.util.Arrays;

public class Solution {
    public int solution(int k, int m, int[] score) {
        int answer = 0;
        int idx = 0;
        // 1. 정렬
        Arrays.sort(score);

        int[] minScore = new int[score.length / m];

        for(int i = score.length-m ; i >= 0 ; i-=m){
            minScore[idx++] = score[i];
        }

        return Arrays.stream(minScore).map(x -> x * m).sum();
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int k = 3; int m = 4;
        int[] score = {1,2,3,1,2,3,1};
        System.out.println(sol.solution(k,m,score));
    }
}
