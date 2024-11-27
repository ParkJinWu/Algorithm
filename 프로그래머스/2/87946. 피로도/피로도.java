public class Solution {
    static boolean[] visited ; // 방문 여부 배열
    static int max = 0; // 최대 탐험 가능한 던전 수
    public int solution(int k, int[][] dungeons) {
        int answer = -1;

        visited = new boolean[dungeons.length];
        dfs(dungeons,k,0);

        return max;
    }

    private static void dfs(int[][] dungeons , int k , int cnt){

        max = Math.max(cnt,max);

        // 던전 탐험
        for (int i = 0; i < dungeons.length; i++) {
            if(!visited[i] && dungeons[i][0] <= k){ // 탐험 가능
                visited[i] = true; // 방문 처리
                dfs(dungeons,k - dungeons[i][1] , cnt +1);
                visited[i] = false;
            }
        }
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int k = 80; // 현재 피로도
        int[][] dungeons = {{80,20},{50,40},{30,10}};

        System.out.println(sol.solution(k,dungeons));
    }
}
