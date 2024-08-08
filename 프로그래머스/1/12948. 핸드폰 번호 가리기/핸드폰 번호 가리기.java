class Solution{
    public String solution(String phone_number) {
        String answer = "";
        String privacy = phone_number.substring(0,phone_number.length()-4);

        answer =  "*".repeat(privacy.length()) + phone_number.substring(phone_number.length()-4);

        return answer;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        String phone_number = "027778888";

        System.out.println(sol.solution(phone_number));
    }
}