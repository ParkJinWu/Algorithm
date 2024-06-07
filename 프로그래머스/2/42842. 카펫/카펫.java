class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        int sum = brown + yellow;
        
        for(int x = 3 ; x < brown / 2 ; x++){
            int y = sum / x;
            
            if(x >= y){
                if((x-2) * (y-2) == yellow){
                    answer[0] = x;
                    answer[1] = y;
                }
            }
        }
        return answer;
    }
}