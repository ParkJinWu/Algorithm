import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

// 트리의 부모 찾기
public class Main {
    static int N;
    static List<Integer> list[] ; // 연결 정보 리스트
    static boolean[] visited; // 방문 여부 체크 배열
    static int[] parents; // 부모 노드 저장 배열
    static StringTokenizer token;

    private static void dfs(int index){
        visited[index] = true; // 방문 처리

        for (int next : list[index]){
            if(!visited[next]){
                parents[next] = index;
                dfs(next);
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        
        // 변수 초기화
        list = new ArrayList[N+1];
        visited = new boolean[N+1];
        parents = new int[N+1];

        // 연결 정보를 저장할 빈 배열 생성
        for (int i = 1; i <= N ; i++) {
            list[i] = new ArrayList<>();
        }

        // 노드 양방향 연결
        for (int i = 1; i < N ; i++) {
            token = new StringTokenizer(br.readLine());
            int A = Integer.parseInt(token.nextToken());
            int B = Integer.parseInt(token.nextToken());

            list[A].add(B);
            list[B].add(A);
        }

        dfs(1);

        for (int i = 2; i <= N ; i++) {
            System.out.println(parents[i]);
        }

    }
}
