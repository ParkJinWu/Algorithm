import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//전쟁 - 전투
//상하좌우 모여있으면 제곱
public class Main {
    static int rows,cols,w_count,b_count,count;
    static char[][] map;
    static boolean[][] visited;

    static int[] dx = {0,0,-1,1};
    static int[] dy = {-1,1,0,0};

    public static void dfs(int x, int y, char color){
        visited[x][y] = true;
        count++;

        for(int i = 0 ; i < 4 ; i++){
            int nextX = x + dx[i];
            int nextY = y + dy[i];

            if(nextX >= 0 && nextX < cols && nextY >= 0 && nextY <rows){
                if(!visited[nextX][nextY] && map[nextX][nextY] == color){
                    dfs(nextX,nextY,color);
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer token = new StringTokenizer(br.readLine());

        rows = Integer.parseInt(token.nextToken()); //가로
        cols = Integer.parseInt(token.nextToken()); //세로

        //배열 크기 초기화
        visited = new boolean[cols][rows];
        map = new char[cols][rows];

        //지도에 정보 입력
        for(int i = 0; i < cols ; i++){ //세로
            String line = br.readLine();
            for(int j = 0; j < rows ; j++){ //가로
                map[i][j] = line.charAt(j) ;
            }
        }

        //전체 지도 탐색
        for(int i = 0 ; i < cols ; i++){ //세로
            for(int j = 0 ; j < rows ; j++){ //가로
                if(!visited[i][j]){
                    count = 0;
                    char color = map[i][j];
                    dfs(i,j,color);
                    if(color == 'W'){
                        w_count += count * count;
                    }else {
                        b_count += count * count;
                    }

                }
            }
        }
        System.out.println(w_count + " " + b_count);

    }
}
