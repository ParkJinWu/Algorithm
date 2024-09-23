import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Solution {
    public int[] solution(int k, int[] score) {
        ArrayList<Integer> list = new ArrayList<>();
        int[] answer = new int[score.length];

        for(int i = 0 ; i < score.length ; i++){
            if(list.size() < k){
                list.add(score[i]);
            }else{
                if(score[i] > Collections.min(list)){
                    list.remove(Collections.min(list));
                    list.add(score[i]);
                }
            }
            answer[i] = Collections.min(list);
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int k = 3;
        int[] score = {10,100,20,150,1,100,200};
        System.out.println(Arrays.toString(sol.solution(k,score)));
    }
}
