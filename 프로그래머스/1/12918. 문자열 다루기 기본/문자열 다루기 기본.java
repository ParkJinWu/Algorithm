public class Solution {
    public boolean solution(String s) {
        // 길이가 4 또는 6이 아닌 경우 바로 false 반환
        if(s.length() != 4 && s.length() != 6){
            return false;
        }

        // 문자열이 숫자인지 확인
        for(int i = 0 ; i < s.length() ; i++){
            if(s.charAt(i) < '0' || s.charAt(i) > '9'){
                return false;
            }
        }
        // 모든 조건을 통과하면 true 반환
        return true;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        String s = "1234";
        System.out.println(sol.solution(s));
    }
}
