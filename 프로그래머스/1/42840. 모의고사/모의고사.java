import java.util.ArrayList;
import java.util.Arrays;

public class Solution {
    public int[] solution(int[] answers) {
        int[] score = new int[3];
        int[] supo1 = {1,2,3,4,5};
        int[] supo2 = {2,1,2,3,2,4,2,5};
        int[] supo3 = {3,3,1,1,2,2,4,4,5,5};

        for(int i = 0; i < answers.length ; i++){
            if(answers[i] == supo1[i % supo1.length]){
                score[0]++;
            }
            if(answers[i] == supo2[i % supo2.length]){
                score[1]++;
            }
            if(answers[i] == supo3[i % supo3.length]){
                score[2]++;
            }
        }

        ArrayList<Integer> result = new ArrayList<>();

        int maxScore = Arrays.stream(score).max().getAsInt();

        for (int i = 0; i < score.length; i++) {
            if(score[i] == maxScore){
                result.add(i+1);
            }
        }

        // int -> array
        return result.stream().mapToInt(i -> i).toArray();
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] answers = {1,2,3,4,5};
        //int[] answers = {1,3,2,4,2};
        System.out.println(Arrays.toString(sol.solution(answers)));
    }

}
