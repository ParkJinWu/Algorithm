import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];

        for (int i = 0; i < commands.length; i++) {
            ArrayList<Integer> list = new ArrayList<>();
            int start = commands[i][0];
            int end = commands[i][1];
            int idx = commands[i][2];

            // Sublist를 생성
            for (int j = start; j <= end; j++) {
                list.add(array[j - 1]);
            }

            // 정렬
            Collections.sort(list);

            // 정렬된 리스트에서 idx번째 수를 가져오기
            answer[i] = list.get(idx - 1);
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] array = {1, 5, 2, 6, 3, 7, 4};
        int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
        System.out.println(Arrays.toString(sol.solution(array, commands)));
    }
}
