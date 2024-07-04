public class Solution {
    int count = 0; //방법의 수 초기화

    public void dfs(int dept, int target, int[] numbers, int sum){
        if(dept == numbers.length){ // 깊이 끝까지 왔을 때
            if(target == sum) count++;
            return;
        }

        dfs(dept+1 ,target,numbers,sum - numbers[dept]);
        dfs(dept + 1,target,numbers,sum + numbers[dept]);
    }


    public int solution(int[] numbers, int target) {
        int answer = 0;

        //0번째를 시작으로 dfs함수 호출
        dfs(0,target,numbers,0);
        answer = count;

        return answer;
    }
}