import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

// 적록 색약
// input : RGB의 지역
// output : 정상인이 보는 구역 색약이 보는 구역
public class Main {
    static int N ;
    static boolean[][] visited;
    static char[][] map;
    static int[] dx = {-1,1,0,0}; // 상하
    static int[] dy = {0,0,-1,1}; // 좌우
//    static int red_count = 0;
//    static int green_count = 0;
//    static int blue_count = 0;
    static int normal = 0;
    static int color_blindness = 0;

    // DFS 탐색 함수
    private static void dfs(int x, int y, char color, boolean is_blindness){
        visited[x][y] = true; // 방문 처리

        // 인접(상하좌우)한 지역 이동
        for (int i = 0; i < 4; i++) {
            int nextX = x + dx[i]; // 다음 x축 이동
            int nextY = y + dy[i]; // 다음 y축 이동

            // 범위 확인을 먼저 수행
            if (nextX >= 0 && nextX < N && nextY >= 0 && nextY < N && !visited[nextX][nextY]) {
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

        N = Integer.parseInt(br.readLine());
        map = new char[N][N];

        // 지역 만들기
        for (int i = 0; i < N; i++) {
            String line = br.readLine();
            for (int j = 0; j < N; j++) {
                map[i][j] = line.charAt(j);
            }
        }
        visited = new boolean[N][N];

        // 지역 순회 (정상인)
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if(!visited[i][j]){
                    dfs(i,j,map[i][j],false);
                    normal++;
                }
            }
        }

        visited = new boolean[N][N]; // 방문 배열 초기화 -> 정상인 체크 후 적록색약에 영향을 주지 않기 위해


        // 지역 순회 (적록색약)
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if(!visited[i][j]){
                    dfs(i,j,map[i][j],true);
                    color_blindness++;
                }
            }
        }

        System.out.println(normal+" "+color_blindness);
    }
}
