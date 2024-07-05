import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

//DFS와BFS
//정점은 1부터 시작하며, V부터 시작한 DFS와BFS 탐색 결과를 순서대로 출력
public class Main {
    static int N,M,V;
    static int[][] graph;
    static boolean[] visited;
    static Queue<Integer> queue = new LinkedList<>();

    public static void dfs(int node){
        visited[node] = true; // 현재 정점 방문 처리

        System.out.print(node + " "); //방문 노드 출력

        //전체 정점 순회
        for (int vertex = 1; vertex <= N ; vertex++){
            //현재 정점과 연결된 정점 중 아직 방문하지 않은 정점일 경우
            if(graph[node][vertex] == 1&& !visited[vertex]){
                dfs(vertex); //연결된 정점을 재귀적으로 호출
            }
        }
    }

    public static void bfs(int node){
        queue.add(node); // 시작 정점은 큐에 먼저 추가
        visited[node] = true; // 현재 정점 방문 처리
        System.out.print(node + " "); //방문 노드 출력

        //큐가 비워질 때 까지 반복
        while (!queue.isEmpty()){
            int tmp = queue.poll(); //큐에서 꺼낸다

            //전체 정점 순회
            for(int next = 1; next <= N ; next++){
                //큐에서 꺼낸 정점과 연결된 정점이며 아직 방문하지 않았을 경우
                if(graph[tmp][next] == 1 && !visited[next]){
                    queue.add(next); //연결된 정점 큐에 추가
                    visited[next] = true; //연결된 정점 방문 처리
                    System.out.print(next + " ");
                }

            }

        }

    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer token = new StringTokenizer(br.readLine());

        N = Integer.parseInt(token.nextToken()); // 정점의 개수
        M = Integer.parseInt(token.nextToken()); // 간선의 개수
        V = Integer.parseInt(token.nextToken()); // 시작 정점

        //정점 초기화 (정점은 1부터 시작)
        graph = new int[N+1][N+1];

        for(int v = 0 ; v < M ; v++){
            token = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(token.nextToken());
            int b  = Integer.parseInt(token.nextToken());

            graph[a][b] = graph[b][a] = 1; //정점 연결
        }

        visited = new boolean[N+1];
        dfs(V); // V로 부터 시작

        System.out.println();

        visited = new boolean[N+1];
        bfs(V); // V로 부터 시작
    }
}
