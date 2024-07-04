public class Solution {

    public static void dfs(int node, int[][] computers, boolean[] visited){
        visited[node] = true; //현재 노드 방문처리

        //다음 노드 순회
        for(int next = 0 ; next < computers.length ; next++){
            //방문하지 않았고, 다음 요소가 연결되어있을 때
            if(!visited[next] && computers[node][next] == 1){
                dfs(next,computers,visited);
            }
        }

    }

    public int solution(int n, int[][] computers) {
        boolean[] visited = new boolean[n]; // 방문여부 처리 배열 초기화
        int cnt= 0; // 연결된 컴퓨터의 개수

        //전체 노드 순회
        for(int vertex = 0 ; vertex < n ; vertex++){
            if(!visited[vertex]){
                dfs(vertex,computers,visited);
                cnt++;
            }
        }

        return cnt;
    }
}