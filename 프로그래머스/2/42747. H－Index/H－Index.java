import java.util.*;

class Solution {
    public int solution(int[] citations) {
        int n = citations.length;
        
        Arrays.sort(citations);
        
        int h = 0;
        for(int i = citations.length -1 ; i >= 0 ; i--){
            System.out.println(citations[i]);
            if(citations[i] >= h+1){
                h++;
            }else{
                break;
            }
        }
        
        System.out.println(Arrays.toString(citations));
        return h;
    }
}