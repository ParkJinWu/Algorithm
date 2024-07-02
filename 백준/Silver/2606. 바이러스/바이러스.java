import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

//바이러스
//1번 컴퓨터부터 시작, 연결되어 있으면 바이러스 전염
public class Main {
    static int[][] graph;
    static boolean[] visited;
    static int N,M;

    //바이러스에 걸리는 컴퓨터 수 == 시작 노드와 연결된 컴퓨터의 수
    static int count = 0;


    private static void dfs(int node){
        visited[node] = true; // 현재 위치 방문 처리
        count++; // 바이러스 증가

        for(int i = 1 ; i < graph.length ; i++){
            if(!visited[i] && graph[node][i] == 1){
                dfs(i);
            }
        }

    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine()); // 컴퓨터의 수
        M = Integer.parseInt(br.readLine()); // 연결된 컴퓨터의 수

        //인덱스 1부터 시작
        graph = new int[N+1][N+1];
        visited = new boolean[N+1];


        //컴퓨터 연결
        for(int c = 0 ; c < M ; c++){
            StringTokenizer token = new StringTokenizer(br.readLine());
            int c1 = Integer.parseInt(token.nextToken());
            int c2 = Integer.parseInt(token.nextToken());

            graph[c1][c2] = graph[c2][c1] = 1 ; // 연결
        }

        dfs(1); // 1번 컴퓨터부터 시작
        System.out.println(count - 1); //1번 컴퓨터 제외

//        for(int a = 1 ; a <= N ; a++){
//            System.out.print(a+"번째 컴퓨터: ");
//            for(int b = 1 ; b <= N ; b++){
//                if(graph[a][b] == 1){
//                    System.out.print(b+" ");
//                }
//            }
//            System.out.println();
//        }

        //0번째 행과 열은 전부 비어져 있다 왜냐하면 1번부터 시작했기 때문
//        for(int[] a : graph){
//            System.out.println(Arrays.toString(a));
//        }

    }
}
