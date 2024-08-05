class Solution {
    public boolean solution(int x) {
        int sum = 0;
        String strX = String.valueOf(x);

        char[] ch = strX.toCharArray();

        for (char c : ch) {
            sum += c - '0';
        }

        return x % sum == 0 ? true : false;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int x = 12;

        System.out.println(sol.solution(x));


    }
}

