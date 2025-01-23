import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

// 트리의 부모 찾기
public class Main {
    static ArrayList<Integer> connection[];
    static boolean[] visited;
    static StringTokenizer token;
    static int N;
    static int[] parents;

    private static void  dfs(int index){
        visited[index] = true; // 현재 노드 방문 처리
        for(int next : connection[index]){
            if(!visited[next]){
                parents[next] = index;
                dfs(next);
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        visited = new boolean[N+1];
        connection = new ArrayList[N+1];
        parents = new int[N+1];

        // 연결 정보를 저장할 리스트 생성
        for (int i = 0; i < N+1 ; i++) {
            connection[i] = new ArrayList<>();
        }

        // 연결 정보 저장
        for (int i = 1; i < N  ; i++) {
            token = new StringTokenizer(br.readLine());
            int A = Integer.parseInt(token.nextToken());
            int B = Integer.parseInt(token.nextToken());

            // 양방향 연결
            connection[A].add(B);
            connection[B].add(A);
        }

        dfs(1);

        for (int i = 2; i <=N ; i++) {
            System.out.println(parents[i]);

        }
    }
}
