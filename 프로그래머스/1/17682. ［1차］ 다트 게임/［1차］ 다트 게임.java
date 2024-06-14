import java.util.*;


class Solution {
    public int solution(String dartResult) {
        int answer = 0;
        int scores[] = new int[3];
        StringBuilder sb = new StringBuilder();
        int idx = 0;
        
        for(int i = 0 ; i < dartResult.length(); i++){
            char ch = dartResult.charAt(i);
            if(Character.isDigit(ch)){ //숫자
                sb.append(ch);
            }else if(Character.isLetter(ch)){//문자
                int n = Integer.parseInt(sb.toString());
                if(ch == 'S'){ //Single
                    scores[idx++] = (int)Math.pow(n,1);
                }else if(ch == 'D'){ // Double
                    scores[idx++] = (int)Math.pow(n,2);
                }else{ // Triple
                    scores[idx++] = (int)Math.pow(n,3);
                }
                sb.setLength(0);
            }else{ //보너스
                if(ch == '*'){
                    scores[idx - 1] *= 2;
                    if(idx >= 2){
                        scores[idx - 2] *= 2;
                    }
                }else{
                    scores[idx-1] *= -1;
                }
            }
        }
        
        
        return Arrays.stream(scores).sum();
    }
}