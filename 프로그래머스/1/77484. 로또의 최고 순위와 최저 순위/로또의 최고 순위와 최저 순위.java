import java.util.Arrays;

public class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int zeroCount = 0;
        int correct = 0;

        for (int i = 0; i < lottos.length; i++) {
            if(lottos[i] == 0){
                zeroCount++;
            }
            for(int j = 0 ; j < lottos.length ; j++){
                if(lottos[i] == win_nums[j]){
                    correct++;
                }
            }
        }

        return new int[]{getRank(correct+zeroCount),getRank(correct)};
    }

    // 순위 계산 메서드
    private int getRank(int correct) {
        switch (correct) {
            case 6: return 1;
            case 5: return 2;
            case 4: return 3;
            case 3: return 4;
            case 2: return 5;
            default: return 6;
        }
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int lottos[] = {44, 1, 0, 0, 31, 25};
        int win_nums[] = {31, 10, 45, 1, 6, 19};
        System.out.println(Arrays.toString(sol.solution(lottos,win_nums)));
    }
}
