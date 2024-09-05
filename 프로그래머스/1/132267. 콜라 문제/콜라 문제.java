public class Solution {
    public int solution(int a, int b, int n) {
        int answer = 0; int bottle = 0; int newBottle = 0;
        
        while (n >= a){
            bottle = n / a;
            newBottle = bottle * b;
            answer += newBottle;
            n = n % a + newBottle; // 남은 콜라 + 새로 얻은 콜라
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        //int a = 3; int b = 1; int n = 20;
        int a = 2; int b = 1; int n = 20;
        System.out.println(sol.solution(a,b,n));
    }
}
