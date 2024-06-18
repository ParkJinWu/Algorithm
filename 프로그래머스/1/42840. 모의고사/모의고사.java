import java.util.*;

class Solution {
    public int[] solution(int[] answers) {

        int[] scores = new int[3];        
        int[] num1 = {1,2,3,4,5};
        int[] num2 = {2,1,2,3,2,4,2,5};
        int[] num3 = {3,3,1,1,2,2,4,4,5,5};
        
        for(int i = 0 ; i < answers.length ; i++){
            if(answers[i] == num1[i % num1.length]){
                scores[0]++;
            }if(answers[i] == num2[i % num2.length]){
                scores[1]++;
            }if(answers[i] == num3[i % num3.length]){
                scores[2]++;
            }
        }
        

        List<Integer> list = new ArrayList<>();
        int max = Math.max(scores[0], Math.max(scores[1],scores[2]));
        
        
        for(int i = 0 ; i < scores.length ; i++){
            if(max == scores[i]){
                list.add(i+1);
            }
        }
        
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}