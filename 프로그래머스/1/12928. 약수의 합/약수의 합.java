class Solution {
    public int solution(int n) {
        int answer = 0;

        for(int i = 1; i <= n ; i++){
            if(n % i == 0){
                answer+=i;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        //int n = 12;
        int n = 5;
        System.out.println(sol.solution(n));

    }
}

