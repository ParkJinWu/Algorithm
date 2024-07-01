import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//단지번호 붙이기
//1 : 집이 있다. 0: 집이 없다
//상하좌우 이동가능 붙어있는 단지 구하기
public class Main {
    static boolean[][] visited; // 방문 여부 확인 배열
    static int[][] map; // 지도
    static int N; //총 단지 수
    static List<Integer> result = new ArrayList<>();

    //상하좌우 이동
    static int[] dx = {0,0,-1,1}; //x축 이동(좌우)
    static int[] dy = {-1,1,0,0}; //y축 이동(상하)


    public static int dfs(int x, int y){
        visited[x][y] = true; //현재 위치 정보 방문 체크
        int count = 1;

        //상하좌우 이동
        for(int i = 0 ; i < 4 ; i++){
            int nextX = x + dx[i];
            int nextY = y + dy[i];

            //범위 제한 (0보다 크고 총 단지수 범위를 넘어서지 않아야함)
            if(nextX >= 0 && nextX < N && nextY >= 0 && nextY < N){
                //방문하지 않았고, 집이 있는 경우
                if(!visited[nextX][nextY] && map[nextX][nextY] == 1){
                    count += dfs(nextX,nextY); // 재귀적으로 dfs호출하고, 단지 수 누적
                }
            }
        }
        return count;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());

        //배열 초기화
        visited = new boolean[N][N];
        map = new int[N][N];

        //지도에 단지 정보 입력
        for(int i = 0 ; i < N ; i++){
            String line = br.readLine();
            for(int j = 0 ; j < N ; j++){
                map[i][j] = line.charAt(j) - '0';
            }
        }

        //모든 지도 탐색 DFS
        for(int i = 0 ; i < N ; i++){
            for(int j = 0 ; j < N ; j++){
                if(!visited[i][j] && map[i][j] == 1){
                    int count = dfs(i,j); // 0,0부터 시작하고 단지 내의 수 저장
                    result.add(count);
                }
            }
        }

        Collections.sort(result); // 오름차순 정렬

        System.out.println(result.size());
        for(int n : result){
            System.out.println(n);
        }


    }
}
