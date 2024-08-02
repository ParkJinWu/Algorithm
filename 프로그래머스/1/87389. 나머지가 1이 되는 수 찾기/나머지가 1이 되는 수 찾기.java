class Solution{
    public int solution(int n) {
        int answer = Integer.MAX_VALUE;
        for (int i = 1; i <= n ; i++) {
            if(n % i == 1){
                if(answer > i){
                    answer = i;
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int n = 12;
        //int n = 10;
        System.out.println(sol.solution(n));

    }
}

