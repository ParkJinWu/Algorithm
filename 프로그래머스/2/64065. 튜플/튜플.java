import java.util.*;

class Solution {
    public int[] solution(String s) {
        s = s.replaceAll("\\{", "");
        
        String[] sArr = s.substring(0, s.length() - 2).split("\\}\\,");
        
        for(int i = 0 ; i < sArr.length -1 ; i++){
            for(int j = i+1 ; j < sArr.length; j++){
                if(sArr[i].length() > sArr[j].length()){
                    String tmp = sArr[i];
                    sArr[i] = sArr[j];
                    sArr[j] = tmp;
                }
            }
        }
        
        Set<Integer> set = new LinkedHashSet<>();
        
        for(String str : sArr){
            String[] tuple = str.split(",");
            for(String el : tuple){
                set.add(Integer.parseInt(el));
            }
        }
        
        int[] answer = new int[set.size()];
        int idx = 0;
        
        for(int num : set){
            answer[idx++] = num;
        }
        
        return answer;
    }
}