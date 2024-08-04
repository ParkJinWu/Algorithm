class Solution {
    public long solution(long n) {
        // 정수를 문자열로 변환
        String numStr = Long.toString(n);
        
        // 문자열을 문자 배열로 변환
        char[] numArr = numStr.toCharArray();
        
        // 문자 배열을 정렬 (내림차순)
        java.util.Arrays.sort(numArr);
        //System.out.println(numArr);
        // 문자 배열을 내림차순으로 정렬하기 위해 역순으로 변환
        StringBuilder sb = new StringBuilder(new String(numArr));
        sb.reverse();
        
        // 정렬된 문자열을 다시 정수로 변환하여 반환
        return Long.parseLong(sb.toString());
    }
}