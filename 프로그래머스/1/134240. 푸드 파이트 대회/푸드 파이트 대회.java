public class Solution {
    public String solution(int[] food) {
        StringBuilder sb= new StringBuilder();
        for (int i = 1; i < food.length; i++) {
            int cnt = 0;
            cnt = food[i] / 2;
            //System.out.println(String.valueOf(food[i]) );
            if(cnt > 0){
                String str = String.valueOf(i);
                sb.append(str.repeat(cnt));
            }
        }
        StringBuilder reverseStr = new StringBuilder(sb).reverse();
        sb.append("0").append(reverseStr);
        return sb.toString();
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        //int[] food = {1,3,4,6};
        int[] food = {1,7,1,2};
        System.out.println(sol.solution(food));
    }
}
