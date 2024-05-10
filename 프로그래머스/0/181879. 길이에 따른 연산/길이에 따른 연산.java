class Solution {
    public int solution(int[] num_list) {
        
        int len = num_list.length;
        int sum = 0;
        int mult = 1;
        
        for(int x : num_list){
            sum+=x;
            mult*=x;
        }
        
        return len >= 11 ? sum : mult;
    }
}