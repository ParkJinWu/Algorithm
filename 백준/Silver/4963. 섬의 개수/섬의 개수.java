import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

//섬의 개수
//상하좌우,대각선 이동 가능
public class Main {
    static boolean[][] visited;
    static int[][] map;
    static int TC,rows,cols;

    //상하좌우, 대각선까지 이동가능
    //(좌상단,우상단,좌하단,우하단,상,하,좌,우)
    static int[] dx = {-1,-1,1,1,-1,1,0,0};
    static int[] dy = {-1,1,-1,1,0,0,-1,1};


    public static void dfs(int x, int y){
        visited[x][y] = true;

        for(int i = 0 ; i < 8 ; i++){
            int nextX = x + dx[i];
            int nextY = y + dy[i];

            if(nextX >= 0 && nextX < rows && nextY >= 0 && nextY < cols){
                if(!visited[nextX][nextY] && map[nextX][nextY] == 1){
                    dfs(nextX,nextY);
                }
            }
        }

    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true){ // 0,0이 입력되면 탈출
            StringTokenizer token = new StringTokenizer(br.readLine());
            cols = Integer.parseInt(token.nextToken()); // 가로(열)
            rows = Integer.parseInt(token.nextToken()); // 세로(행)

            if(cols == 0 && rows == 0) break;

            //배열 초기화
            visited = new boolean[rows][cols];
            map = new int[rows][cols];
            int count = 0;

            //지도에 정보 넣기
            for(int row = 0 ; row < rows ; row++){
                token = new StringTokenizer(br.readLine());
                for (int col = 0 ; col < cols ; col++){
                    map[row][col] = Integer.parseInt(token.nextToken());
                }
            }

            //모든 지도 탐색
            for(int i = 0 ; i < rows; i++){
                for(int j = 0 ; j < cols ; j++){
                    //방문하지 않았고, 땅인 경우 dfs함수 호출
                    if(!visited[i][j] && map[i][j] == 1){
                        dfs(i,j);
                        count++;
                    }
                }
            }

            System.out.println(count);
        }//while
    }
}
