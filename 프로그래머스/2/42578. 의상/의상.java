import java.util.*;

class Solution {
    public int solution(String[][] clothes) {
        int answer = 1;
        
        HashMap<String,Integer> map = new HashMap<>();
        
        for(int i = 0 ; i < clothes.length ; i++){
            String type = clothes[i][1];
            map.put(type,map.getOrDefault(type,0) + 1);
        }
        
        for(int val : map.values()){
             answer *= val + 1;
        }
        
        return answer-1;
    }
}