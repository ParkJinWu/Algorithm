import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {
    static int rows, cols, count;
    static int[][] map;
    static boolean[][] visited;
    static ArrayList<Integer> result = new ArrayList<>();

    //상하좌우 이동 방향
    static int dx[] = {0, 0, -1, 1};
    static int dy[] = {-1, 1, 0, 0};

    public static void dfs(int x, int y) {
        visited[x][y] = true; // 현재 위치 방문 처리
        count++; // 영역 개수 증가

        for (int i = 0; i < 4; i++) {
            int nextX = x + dx[i];
            int nextY = y + dy[i];

            if (nextX >= 0 && nextX < rows && nextY >= 0 && nextY < cols) {
                if (map[nextX][nextY] == 0 && !visited[nextX][nextY]) {
                    dfs(nextX, nextY);
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer token = new StringTokenizer(br.readLine());

        rows = Integer.parseInt(token.nextToken()); //가로 -> 세로(열)
        cols = Integer.parseInt(token.nextToken()); //세로 -> 가로(행)
        int K = Integer.parseInt(token.nextToken());

        //배열 초기화
        map = new int[rows][cols];
        visited = new boolean[rows][cols]; // 방문 배열 초기화

        for (int k = 0; k < K; k++) {
            token = new StringTokenizer(br.readLine());
            int x1 = Integer.parseInt(token.nextToken());
            int y1 = Integer.parseInt(token.nextToken());
            int x2 = Integer.parseInt(token.nextToken());
            int y2 = Integer.parseInt(token.nextToken());

            for (int y = y1; y < y2; y++) {
                for (int x = x1; x < x2; x++) {
                    map[y][x] = 1;
                }
            }
        }//for K

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (map[i][j] == 0 && !visited[i][j]) {
                    count = 0;
                    dfs(i, j); // (0,0)시작
                    result.add(count);
                }
            }
        }

        Collections.sort(result);

        System.out.println(result.size());
        for (int n : result) {
            System.out.print(n + " ");
        }
    }
}
