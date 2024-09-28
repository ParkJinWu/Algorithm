public class Solution {
    public int solution(int number, int limit, int power) {
        int answer = 0;
        for(int i = 1 ; i <= number ; i++){
            int attackValue = divisorCount(i);
            if(attackValue > limit){
                attackValue = power;
            }
            answer+= attackValue;
        }
        return answer;
    }

    public static int divisorCount(int num){
        int cnt = 0;
        for(int i = 1 ; i * i <= num ; i++){
            if(num % i == 0){
                if(i * i == num){
                    cnt++;
                }else {
                    cnt+=2;
                }
            }
        }
        return cnt;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        //int number = 5; int limit = 3; int power = 2;
        int number = 10; int limit = 3; int power = 2;
        System.out.println(sol.solution(number,limit,power));
    }
}
