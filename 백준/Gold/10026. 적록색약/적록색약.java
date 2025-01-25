import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

// 적록색약
// output : 정상인이 보는 구역, 적록색약이 보는 구역
public class Main {
    static int N;
    static char[][] map;
    static boolean[][] visited;
    static int normal = 0;
    static int blindness = 0;

    static int[] dx = {-1,1,0,0}; // 상하
    static int[] dy = {0,0,-1,1}; // 좌우

    private static void dfs(int x, int y, char color, boolean is_blindness){
        visited[x][y] = true; // 방문 처리

        for (int d = 0; d < 4; d++) {
            int nextX = x + dx[d];
            int nextY = y + dy[d];

            // 범위 내에 있고, 방문하지 않았다면
            if(nextX >= 0 && nextX < N && nextY >= 0 && nextY < N && !visited[nextX][nextY]){
                if(is_blindness){ // 적록 색약
                    if((map[nextX][nextY] == 'R' || map[nextX][nextY] == 'G') && (color == 'R' || color == 'G')){
                        dfs(nextX,nextY,color,true);
                    } else if (map[nextX][nextY] == color) {
                        dfs(nextX,nextY,color,true);
                    }
                }else { // 정상인
                    if(map[nextX][nextY] == color){
                        dfs(nextX,nextY,color,false);
                    }
                }
            }
        }


    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine()); // 지역의 크기
        map = new char[N][N];
        visited = new boolean[N][N];

        // 지역 초기화
        for (int i = 0; i < N; i++) {
            String line = br.readLine();
            for (int j = 0; j < N; j++) {
                map[i][j] = line.charAt(j);
            }
        }

        // 지역 순회 (정상인)
        for (int x = 0; x < N; x++) {
            for (int y = 0; y < N; y++) {
                if(!visited[x][y]){ // 방문하지 않았다면 순회
                    dfs(x,y,map[x][y],false);
                    normal++;
                }
            }
        }

        visited = new boolean[N][N]; // 방문 여부 배열 초기화

        // 지역 순회 (적록색약)
        for (int x = 0; x < N; x++) {
            for (int y = 0; y < N; y++) {
                if(!visited[x][y]){ // 방문하지 않았다면 순회
                    dfs(x,y,map[x][y],true);
                    blindness++;
                }
            }
        }

        System.out.println(normal + " " + blindness);
    }
}
