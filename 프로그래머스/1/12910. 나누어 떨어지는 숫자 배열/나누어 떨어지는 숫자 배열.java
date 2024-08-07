import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int num : arr) {
            if(num % divisor == 0){
                list.add(num);
            }
        }

        if(list.isEmpty()){
            return new int[] {-1};
        }

        int[] answer = list.stream().mapToInt(Integer::intValue).toArray();
        Arrays.sort(answer);
        return answer;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        //int[] arr = {5,9,7,10};
        //int divisor = 5;

        int[] arr = {2, 36, 1, 3};
        int divisor = 1;

        System.out.println(Arrays.toString(sol.solution(arr,divisor)));


    }
}

