public class Solution {
    public int solution(int[] number) {
        int answer = 0;
        for (int i = 0; i < number.length; i++) {
            for(int j = i + 1 ; j < number.length ; j++){
                for(int k = j + 1 ; k < number.length ; k++){{
                    if(number[i] + number[j] + number[k] == 0){
                        answer++;
                    }
                }
                }
            }

        }

        return answer;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        //int number[] = {-2, 3, 0, 2, -5};
        int number[] = {-3, -2, -1, 0, 1, 2, 3};
        System.out.println(sol.solution(number));
    }
}
