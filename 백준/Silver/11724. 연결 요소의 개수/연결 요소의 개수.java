import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//연결 요소의 개수
public class Main {
    static int N,M;
    static boolean[] visited;
    static int[][] graph;

    private static void dfs(int node){
        visited[node] = true; // 현재 위치 방문 처리

        for(int next = 1 ; next <= N ; next++){
            if(!visited[next] && graph[node][next] == 1){
                dfs(next);
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer token = new StringTokenizer(br.readLine());

        N = Integer.parseInt(token.nextToken());
        M = Integer.parseInt(token.nextToken());

        visited = new boolean[N+1];
        graph = new int[N+1][N+1];

        //정점 연결
        for(int k = 0 ; k < M ; k++){
            token = new StringTokenizer(br.readLine());

            int u = Integer.parseInt(token.nextToken());
            int v = Integer.parseInt(token.nextToken());

            graph[u][v] = graph[v][u] = 1;
        }

        int count = 0 ; //연결 요소의 개수

        //전체 정점 순회(1부터 시작)
        for(int vertex = 1 ; vertex <= N ; vertex++){
            if(!visited[vertex]){
                dfs(vertex);
                count++;
            }
        }

        System.out.println(count);

//        for(int a = 1 ; a <= N ; a++){
//            System.out.print(a+"번째 컴퓨터: ");
//            for(int b = 1 ; b <= N ; b++){
//                if(graph[a][b] == 1){
//                    System.out.print(b+" ");
//                }
//            }
//            System.out.println();
//        }

    }
}
