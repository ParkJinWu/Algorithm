public class Solution {
    public long solution(int price, int money, int count) {
        long sum = 0;
        for(int i = 1; i <= count ; i++){
            sum += price * i;
        }
        return sum < money ? 0 : sum - money;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int price = 3;
        int money = 20;
        int count = 4;
        System.out.println(sol.solution(price,money,count));
    }
}
