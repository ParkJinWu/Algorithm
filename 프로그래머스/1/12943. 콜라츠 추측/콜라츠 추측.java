class Solution {
    public int solution(long num) {
        int cnt = 0;
        while (num != 1) {
            if (isEven(num)) {
                num /= 2;
            } else {
                num = num * 3 + 1;
            }
            cnt++;
            // 최대 500회 반복 여부 체크
            if (cnt >= 500) {
                return -1;

            }
        }
        return cnt;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int n = 626331;

        System.out.println(sol.solution(n));
    }

    private boolean isEven(long n){
        return n % 2 == 0;
    }
}

