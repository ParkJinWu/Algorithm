import java.util.HashSet;

public class Solution {
    public int solution(int[] nums) {
        int maximum = nums.length/2; // 가질 수 있는 최대의 폰켓몬의 수

        HashSet<Integer> set = new HashSet<>();
        for(int n : nums){
            set.add(n);
        }

        if(maximum > set.size()){
            return set.size();
        }
        else {
            return maximum;
        }
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        //int[] nums = {3,1,2,3};
        //int[] nums = {3,3,3,2,2,2};
        int[] nums = {3,1,2,3};
        System.out.println(sol.solution(nums));
    }
}
