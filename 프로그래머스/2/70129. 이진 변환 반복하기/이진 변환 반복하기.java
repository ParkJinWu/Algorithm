class Solution {
    public int[] solution(String s) {
        int[] answer = new int[2];
        int cnt = 0;
        String result = s;
        
        while (!result.equals("1")) {
            int zeroCnt = 0;
            StringBuilder newResult = new StringBuilder();
            for (int i = 0; i < result.length(); i++) {
                if (result.charAt(i) != '0') {
                    newResult.append(result.charAt(i));
                } else {
                    zeroCnt++;
                }
            }
            
            cnt++;
            int len = newResult.length();
            String binaryString = Integer.toBinaryString(len);
            answer[0] = cnt;
            answer[1] += zeroCnt;
            
            result = binaryString;
        }
        
        return answer;
    }
}