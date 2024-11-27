import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static boolean[] visited ;
    static StringBuilder sb = new StringBuilder();
    static int[] arr ;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer token = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(token.nextToken());
        int M = Integer.parseInt(token.nextToken());

        visited = new boolean[N + 1];
        arr = new int[M];

        sequence(N,M,0,arr);
        System.out.println(sb);
    }

    public static void sequence(int N, int M, int count, int[] arr ){
        if (count == M){
            for (int i = 0; i < M; i++) {
                sb.append(arr[i]).append(" ");
            }
            sb.append("\n");
            return;
        }

        // 순열 생성
        for (int i = 1; i <= N ; i++) {
            if(!visited[i]){
                visited[i] = true;
                arr[count] = i;
                sequence(N,M,count +1, arr);
                visited[i] = false;
            }
        }
    }
}
