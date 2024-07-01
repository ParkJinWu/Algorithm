import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 유기농 배추
// 상하좌우 이동가능, 인접하면 이동 가능
// 1: 배추 O, 0: 배추 X
public class Main {
    static boolean[][] visited;
    static int[][] map;
    static int T, rows, cols, K;

    // 상하좌우 4방향 이동
    static int[] dx = {0, 0, -1, 1}; // x축 (좌우)
    static int[] dy = {-1, 1, 0, 0}; // y축 (상하)

    public static void dfs(int x, int y) {
        visited[x][y] = true;

        // 상하 좌우 이동
        for (int i = 0; i < 4; i++) {
            int nextX = x + dx[i];
            int nextY = y + dy[i];

            // 범위 제한: x축 이동(행까지), y축 이동(열까지)
            if (nextX >= 0 && nextX < rows && nextY >= 0 && nextY < cols) {
                // 방문하지 않았고, 배추가 있는 경우 dfs재귀 호출
                if (!visited[nextX][nextY] && map[nextX][nextY] == 1) {
                    dfs(nextX, nextY);
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        T = Integer.parseInt(br.readLine()); // TC
        StringTokenizer token;

        for (int t = 0; t < T; t++) {
            token = new StringTokenizer(br.readLine());

            cols = Integer.parseInt(token.nextToken()); // 가로(열)
            rows = Integer.parseInt(token.nextToken()); // 세로(행)
            K = Integer.parseInt(token.nextToken());

            visited = new boolean[rows][cols];
            map = new int[rows][cols];
            int count = 0; // 새로운 TC마다 초기화

            for (int j = 0; j < K; j++) {
                token = new StringTokenizer(br.readLine());
                int x = Integer.parseInt(token.nextToken());
                int y = Integer.parseInt(token.nextToken());

                map[y][x] = 1; // 문제에서 주어지는 좌표 형식에 맞게 수정
            } // for K

            // 모든 지도 탐색 DFS
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    // 방문하지 않았고, 배추가 있는 경우
                    if (!visited[i][j] && map[i][j] == 1) {
                        dfs(i, j);
                        count++;
                    }
                }
            }

            System.out.println(count);

        } // for T
    }
}
