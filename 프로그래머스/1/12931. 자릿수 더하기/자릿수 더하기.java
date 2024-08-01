class Solution {
    public int solution(int n) {
        int sum = 0;

        while (n > 0){
            sum += n % 10;
            n /= 10;
        }

        return sum;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int N1 = 123;
        int N2 = 987;
        System.out.println(sol.solution(N2));
    }
}

