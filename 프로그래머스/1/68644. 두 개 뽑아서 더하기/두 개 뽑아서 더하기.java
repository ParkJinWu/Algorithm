import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Solution {
    public int[] solution(int[] numbers) {
        int[] answer = {};
        Set<Integer> set = new HashSet<>();
        for(int i = 0 ; i < numbers.length ; i++){
            for(int j = i + 1 ; j <numbers.length ; j++){
                set.add(numbers[i] + numbers[j]);
            }
        }

        return set.stream()
                .sorted()
                .mapToInt(Integer::intValue)
                .toArray();
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        //int[] numbers = {2,1,3,4,1};
        int[] numbers = {5,0,2,7};
        System.out.println(Arrays.toString(sol.solution(numbers)));
    }
}
