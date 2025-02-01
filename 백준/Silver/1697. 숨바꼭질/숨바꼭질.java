import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

// 숨박꼭질
// 이동 : X - 1, X + 1, 2 * X
// 수빈이가 동생을 찾을 수 있는 가장 빠른 시간이 몇 초 후인지
public class Main {
    static boolean[] visited ;
    static int[] direction = {-1,1,2};

    private static int bfs(int index, int target){
        Queue<int [] > queue = new LinkedList<>(); // 인접 위치를 저장할 큐
        visited[index] = true; // 현재 위치 방문 처리

        queue.offer(new int[] {index,0}); // 초기 삽입

        // 큐가 비어있지 않을 때 까지 반복
        while (!queue.isEmpty()){
            int[] curr = queue.poll();
            int position = curr[0];
            int time = curr[1];

            if(position == target) return time; // 목표 달성 시 탈출

            for (int i = 0; i < 3; i++) {
                // 다음 이동 방향
                int next = direction[i] == 2 ? direction[i] * position : direction[i] + position;

                // 범위 내에 있고, 방문하지 않았다면
                if(next >= 0 && next < 100001 && !visited[next]){
                    visited[next] = true; // 방문처리
                    queue.offer(new int[] {next, time+1});
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader  br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer token = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(token.nextToken()); // 수빈
        int K = Integer.parseInt(token.nextToken()); // 동생
        visited = new boolean[100001];

        System.out.println(bfs(N,K));
    }
}
