import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

// 토마토(2)
// 정수 1은 익은 토마토, 정수 0 은 익지 않은 토마토, 정수 -1은 토마토가 들어있지 않은 칸
public class Main {
    static int N,M,H;
    static int[][][] box ;
    static StringTokenizer token;
    static Queue<int []> queue = new LinkedList<>();
    static int days;
    static int[] dx = {-1,1,0,0,0,0}; // 상하
    static int[] dy = {0,0,-1,1,0,0}; // 좌우
    static int[] dz = {0,0,0,0,-1,1}; // 앞뒤

    private static void bfs(){
        days = -1; // 날짜 초기화

        while (!queue.isEmpty()){
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                int[] cur = queue.poll();
                int z = cur[0], x = cur[1], y = cur[2];

                for (int d = 0; d < 6; d++) { // 상하좌우앞뒤 : 6방향
                    int nx = x + dx[d];
                    int ny = y + dy[d];
                    int nz = z + dz[d];

                    // 범위 내에 있고, 익지 않았다면
                    if(nx >= 0 && ny >= 0 && nz >= 0 && nx < N && ny < M && nz < H && box[nz][nx][ny] == 0){
                        box[nz][nx][ny] = 1; // 인접한 토마토 익히기
                        queue.offer(new int[]{nz,nx,ny}); // 새롭게 익은 토마토 큐에 추가
                    }
                }
            }
            days++;
        }
    }

    private static int checkTomato(){
        // 박스를 순회하면서 토마토 체크
        for (int i = 0; i < H ; i++) {
            for (int j = 0; j < N ; j++) {
                for (int k = 0; k < M; k++) {
                    if(box[i][j][k] == 0){
                        return -1;
                    }
                }
            }
        }
        return days;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        token = new StringTokenizer(br.readLine());

        M = Integer.parseInt(token.nextToken()); // 상자의 가로
        N = Integer.parseInt(token.nextToken()); // 상자의 세로
        H = Integer.parseInt(token.nextToken()); // 상자의 높이

        box = new int[H][N][M]; // 상자 크기 초기화 (높이, 행(세로), 열(가로))

        // 상자 값 초기화
        for (int i = 0; i < H ; i++) {
            for (int j = 0; j < N ; j++) { // 가로(행 이동)
                token = new StringTokenizer(br.readLine());
                for (int k = 0; k < M  ; k++) { // 세로 (열 이동)
                    box[i][j][k] = Integer.parseInt(token.nextToken());
                    if(box[i][j][k] == 1){
                        queue.offer(new int[]{i,j,k}); // 익은 토마토의 위치 저장
                    }
                }
            }
        }

        bfs();
        System.out.println(checkTomato());
    }
}
