import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

//미로 탐색
//1:이동 가능, 0: 이동 불가능
//(1,1) ~ (N,M) 최단 거리 출력
public class Main {
    static int N,M,count;
    static int[][] map;
    static boolean[][] visited;

    //상하 좌우 이동 방향 배열
    static int dx[] = {0,0,-1,1};
    static int dy[] = {-1,1,0,0};

    public static void bfs(int x, int y){
        Queue<int []> queue = new LinkedList<>();
        queue.offer(new int[] {x,y}); //초기 값 큐에 넣기
        visited[x][y] = true; //시작 위치 방문 처리

        count = 1; //현재 위치도 포함

        //큐가 비워질 때 까지 반복
        while (!queue.isEmpty()){
            int[] nowArr = queue.poll();
            //현재 좌표
            int nowX = nowArr[0];
            int nowY = nowArr[1];

            if(nowX == N -1 && nowY == M -1){
                count = map[nowX][nowY];
                return;
            }

            for(int i = 0 ; i < 4 ; i++){
                int nextX = nowX + dx[i];
                int nextY = nowY + dy[i];

                //범위 제한
                if(nextX >= 0 && nextX < N && nextY >=0 && nextY < M){
                    //다음 방향이 1이며, 아직 방문하지 않은 경우
                    if(map[nextX][nextY] == 1 && !visited[nextX][nextY]){
                        queue.offer(new int[] {nextX,nextY}); //다음 방향 넣고
                        visited[nextX][nextY] = true; //다음 방향 방문 처리

                        //다음 방향 업데이트
                        map[nextX][nextY] = map[nowX][nowY] + 1;
                    }
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer token = new StringTokenizer(br.readLine());

        N = Integer.parseInt(token.nextToken());
        M = Integer.parseInt(token.nextToken());

        //배열 초기화
        visited = new boolean[N][M];
        map = new int[N][M];

        for(int i = 0 ; i < N ; i++){
            String line = br.readLine();
            for(int j = 0 ; j < M ; j++){
                map[i][j] = line.charAt(j) - '0';
            }
        }

        bfs(0,0); //(0,0) 시작
        System.out.println(count);

    }
}
