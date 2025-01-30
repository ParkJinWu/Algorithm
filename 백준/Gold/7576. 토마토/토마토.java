import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

// 토마토
// 인접한 곳 : 상하좌우
// output : 토마토가 다 익는 데 걸리는 최소일 수, 모든 토마토가 익어있는 상태면 0 안익으면 -1
public class Main {
    static int[][] warehouse ;
    static int[] dx = {-1,1,0,0}; // 상하
    static int[] dy = {0,0,-1,1}; // 좌우
    static Queue<int []> queue = new LinkedList<>();
    static int N,M;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer token = new StringTokenizer(br.readLine());

        M = Integer.parseInt(token.nextToken()); // 가로
        N = Integer.parseInt(token.nextToken()); // 세로

        warehouse = new int[N][M];

        for (int i = 0; i < N; i++) { // 세로(행)
            token = new StringTokenizer(br.readLine());
            for (int j = 0; j < M; j++) { // 가로(열)
                warehouse[i][j] = Integer.parseInt(token.nextToken());
                if(warehouse[i][j] == 1){ // 익은 토마토의 위치 추가
                    queue.add(new int[]{i,j});
                }
            }
        }

        bfs();

    }

    // 너비 우선 탐색 알고리즘
    private static void bfs() {
        int days = -1; // 토마토가 익는 날짜

        // 비어있으면 탈출
        while (!queue.isEmpty()){
            int size = queue.size();
            days++; // 날짜 증가

            for (int i = 0; i < size; i++) {
                int[] curr = queue.poll();

                int x = curr[0], y = curr[1];

                for (int d = 0; d < 4; d++) {
                    int nextX = x + dx[d];
                    int nextY = y + dy[d];

                    // 범위 내에 있고, 안익었다면
                    if(nextX >= 0 && nextX < N && nextY >= 0 && nextY < M && warehouse[nextX][nextY] == 0){
                        warehouse[nextX][nextY] = 1; // 토마토 익히기
                        queue.offer(new int []{nextX,nextY});// 인접한 토마토 넣기
                    }
                }
            }
        }

        if(checkTomato()){
            System.out.println(days);
        }else {
            System.out.println(-1);
        }
    }

    private static boolean checkTomato(){
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if(warehouse[i][j] == 0){
                    return false; // 안익은 토마토가 있다면 false
                }
            }
        }
        return true; // 다익음
    }
}
