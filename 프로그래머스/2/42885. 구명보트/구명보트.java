import java.util.*;

class Solution {
    public int solution(int[] people, int limit) {
        int minWeight = 0, maxWeight = people.length-1;
        int boat = 0;
        
        Arrays.sort(people);
        
        while(minWeight <= maxWeight){
            boat++;
            if(people[minWeight] + people[maxWeight] <= limit){
                minWeight++;
            }
            maxWeight--;
        }
        
        return boat;
    }
}