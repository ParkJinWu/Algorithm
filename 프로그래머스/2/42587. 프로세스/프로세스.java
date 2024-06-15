import java.util.PriorityQueue;
import java.util.Collections;

class Solution {
    public int solution(int[] priorities, int location) {
        PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());
        
        for(int pr : priorities){
            queue.offer(pr);
        }
        
        int idx = 0 ;
        
        while(!queue.isEmpty()){
            for(int i = 0 ; i < priorities.length ; i++){
                if(priorities[i] == queue.peek()){
                    queue.poll(); // 인쇄
                    idx++; // 몇 번째로 인쇄되었는 지 
                    
                    if (i == location) { // 인쇄 요청 문서인 경우
                        return idx; // 인쇄 순서 반환
                    }
                    
                }
            }
        }

        return idx;
    }
}