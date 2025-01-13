import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

// 스타트와 링크
// N 은 짝수
// 두팀의 능력치 차이 출력 (최솟값)
public class Main {
    static boolean[] visited;
    static int N ;
    static int[][] map;
    static int min;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        StringTokenizer token ;

        map = new int[N+1][N+1];
        visited = new boolean[N+1];
        min = Integer.MAX_VALUE;

        for (int i = 1; i <= N; i++) {
            token = new StringTokenizer(br.readLine());
            for (int j = 1; j <= N; j++) {
                map[i][j] = Integer.parseInt(token.nextToken());
            }
        }

        divideTeams(1, 0); // 1부터 시작

        System.out.println(min);
    }

    private static void divideTeams(int idx, int count) {

        if(count == N / 2){
            diffScore();
            return;
        }

        for (int i = idx; i <= N ; i++) {
            if(!visited[i]){// 방문하지 않았다면
                visited[i] = true;// 방문 처리
                divideTeams(i + 1,count + 1 );
                visited[i] = false;
            }

        }
    }

    private static void diffScore() {
        int teamStart = 0; int teamLink = 0;

        for (int i = 1; i <= N ; i++) {
            for (int j = i+1; j <= N; j++) {
                if(visited[i] && visited[j]){ // 스타트
                    teamStart += map[i][j] + map[j][i];
                }else if(!visited[i] && !visited[j]) { // 링크
                    teamLink += map[i][j] + map[j][i];
                }
            }
        }

        int diff = Math.abs(teamLink - teamStart);
        min = Math.min(min, diff);
    }
}
