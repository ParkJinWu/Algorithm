import java.util.Arrays;

public class Solution {
    public int solution(int n, int m, int[] section) {
        int cnt = 0;
        int wall[] = new int[n];

        Arrays.fill(wall,1);
        for(int i : section){
            wall[i-1] = 0;
        }

        int idx = 0;
        while (idx < n){
            if(wall[idx] == 0){
                cnt++;
                idx+=m;
            }else {
                idx++;
            }
        }

        return cnt;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int n = 8;
        int m = 4;
        int[] section = {2,3,6};
        System.out.println(sol.solution(n,m,section));
    }
}
