import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

// 안전 영역
public class Main {
    static int[][] map ;
    static StringTokenizer token;
    static int maxH;
    static int N;
    static boolean[][] visited;
    static int[] dx = {-1,1,0,0}; // 상하
    static int[] dy = {0,0,-1,1}; // 좌우

    private static void dfs(int x, int y, int h){
        visited[x][y] = true; // 현재 영역 방문 처리

        // 상하 좌우 이동
        for (int i = 0; i < 4; i++) {
            int nextX = x + dx[i];
            int nextY = y + dy[i];

            // 범위 내에 있고 잠기지 않은 영역이라면
            if(nextX >= 0 && nextX < N && nextY >= 0 && nextY < N){
                if(map[nextX][nextY] > h && !visited[nextX][nextY]){
                    dfs(nextX, nextY, h);
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        map = new int[N][N];
        maxH = Integer.MIN_VALUE;

        // 지역 만들기
        for (int i = 0; i < N; i++) {
            token = new StringTokenizer(br.readLine()); // 공백 기준으로 분리
            for (int j = 0; j < N; j++) {
                map[i][j] = Integer.parseInt(token.nextToken());
                maxH = Math.max(maxH, map[i][j]); // 최대 높이 갱신
            }
        }

        int maxSafeAreas = 0; // 최대 안전 영역 개수

        // 모든 영역 순회
        for (int height = 0; height <= maxH ; height++) {
            visited = new boolean[N][N];
            int safeAreas = 0;           // 현재 높이의 안전 영역 개수


            for (int x = 0; x < N; x++) {
                for (int y = 0; y < N; y++) {
                    // 잠기지 않고, 안전한 영역이면 새로운 안전 영역
                    if(!visited[x][y] && map[x][y] > height){
                        dfs(x, y,height); // dfs순회
                        safeAreas++;
                    }
                }
            }

            maxSafeAreas = Math.max(maxSafeAreas,safeAreas);
        }

        System.out.println(maxSafeAreas);
    }
}
