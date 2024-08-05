class Solution {
    public long solution(int a, int b) {
        long sum = 0;
        int max = Math.max(a,b);
        int min = Math.min(a,b);
        for (int i = min; i <= max; i++) {
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int a = 3; int b = 5;

        System.out.println(sol.solution(a,b));


    }
}

