import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 스타트와 링크
public class Main {
    static int N ;
    static boolean[] visited;
    static int[][] map;
    static int minDiffValue;


    // 팀을 나누고, 두 팀의 점수 차를 구하는 diffScore 함수 호출
    private static void divideTeams(int order, int count) {
        if(count == N / 2){
            diffScore();
            return;
        }

        for (int i = order; i < N ; i++) {
            if (!visited[i]) { // 방문하지 않았다면
                visited[i] = true; // 방문 처리
                divideTeams(i + 1, count + 1);
                visited[i] = false;
            }
        }
    }

    // 두 팀의 점수 차이 구하는 함수
    private static void diffScore() {
        // Start 팀과 Link 팀의 점수를 저장할 변수 초기화
        int teamStart = 0; int teamLink = 0;

        for (int i = 0; i < N ; i++) {
            for (int j = i + 1; j < N; j++) {
                if(visited[i] && visited[j]){ // team start
                    teamStart += map[i][j] + map[j][i];
                }else if(!visited[i] && !visited[j]){
                    teamLink += map[i][j] + map[j][i];
                }
            }
        }

        int diff = Math.abs(teamStart - teamLink);
        minDiffValue = Math.min(diff,minDiffValue);
    }


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer token;

        N = Integer.parseInt(br.readLine());
        map = new int[N][N];
        visited = new boolean[N];
        minDiffValue = Integer.MAX_VALUE; // 가장 큰 값으로 초기화 (0 방지)

        for (int i = 0; i < N; i++) {
            token = new StringTokenizer(br.readLine());

            for (int j = 0; j < N; j++) {
                map[i][j] = Integer.parseInt(token.nextToken());
            }
        }

        // 팀 나누기
        divideTeams(0,0);
        System.out.println(minDiffValue);
    }
}
