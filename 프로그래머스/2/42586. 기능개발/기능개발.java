import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        Queue<Integer> queue = new LinkedList<>();
        List<Integer> result = new ArrayList<>();
        for(int i = 0 ; i < progresses.length ; i++){
            int days = (int)Math.ceil((100.0 - progresses[i]) / speeds[i]);
            
            if(!queue.isEmpty() && queue.peek() < days){ //넣을 값이 크면 큐비우기
                result.add(queue.size());
                queue.clear();
            }
            
            queue.offer(days);
        }
        
        result.add(queue.size());

        return result.stream().mapToInt(i -> i).toArray();
    }
}