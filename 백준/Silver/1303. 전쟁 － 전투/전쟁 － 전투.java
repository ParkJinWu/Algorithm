import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

//전쟁 - 전투
//상하좌우 이동가능, N명이 뭉쳐있을 땐 N^2의 위력
public class Main {
    static int rows,cols,count;
    static char[][] map;
    static boolean[][] visited;
    static int white_count, black_count;

    //상하좌우 이동 방향
    static int[] dx = {0,0,-1,1};
    static int[] dy = {-1,1,0,0};

    public static void dfs(int x, int y, char color){
        visited[x][y] = true; //현재 위치 방문 처리
        count++;

        for(int i = 0 ; i < 4 ; i++){
            int nextX = x + dx[i];
            int nextY = y + dy[i];

            if(nextX >= 0 && nextX < cols && nextY >= 0 && nextY < rows){
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

        visited = new boolean[cols][rows];
        map = new char[cols][rows];

        for(int i = 0 ; i < cols ; i++){
            String line = br.readLine();
            for(int j = 0 ; j < rows; j++){
                map[i][j] = line.charAt(j);
            }
        }

        white_count = 0;
        black_count = 0;

        for(int i = 0 ; i < cols ; i++){
            for(int j = 0 ; j < rows; j++){
                if(!visited[i][j]){
                    count = 0;
                    dfs(i,j,map[i][j]); //(0,0)시작
                    if(map[i][j] == 'W'){
                        white_count += Math.pow(count,2);
                    }else {
                        black_count += Math.pow(count,2);
                    }
                }
            }
        }

        System.out.println(white_count + " " + black_count);
    }
}
