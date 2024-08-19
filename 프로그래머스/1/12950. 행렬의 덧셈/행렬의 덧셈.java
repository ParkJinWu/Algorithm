import java.util.Arrays;

public class Solution {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        int[][] answer = new int[arr1.length][arr1[0].length];
        for(int i = 0 ; i < arr1.length; i++){ //행
            for(int j = 0 ; j < arr1[0].length; j++){//열
                answer[i][j] = arr1[i][j] + arr2[i][j];
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int[][] arr1= {{1,2},{2,3}}; int[][] arr2= {{3,4},{5,6}};
        //int[][] arr1= {{1},{2}}; int[][] arr2= {{3},{4}};
        int[][] result = sol.solution(arr1,arr2);
        for(int n[] : result){
            System.out.println(Arrays.toString(n));
        }

    }
}
