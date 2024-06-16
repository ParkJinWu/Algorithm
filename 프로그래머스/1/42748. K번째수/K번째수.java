import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        
        for(int i = 0 ; i < commands.length ; i++){
                int a = commands[i][0];
                int b = commands[i][1];
                int k = commands[i][2];
                
                //a-1 ~ b-1
                int[] arr = Arrays.copyOfRange(array,a-1,b);
                Arrays.sort(arr);
                answer[i] = arr[k-1];
        }
        return answer;
    }
}