import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int[] arr ;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer token = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(token.nextToken());
        int M = Integer.parseInt(token.nextToken());

        arr = new int[M];

        getPermutation(1, N,0);
        System.out.println(sb);
    }

    public static void getPermutation(int start, int end, int dept){
        // M개를 다 고르면 출력
        if(dept == arr.length){
            for (int i = 0; i < arr.length; i++) {
                sb.append(arr[i]).append(" ");
            }
            sb.append("\n");
            return;
        }

        for (int i = start; i <= end; i++) {
            arr[dept] = i;
            getPermutation(i + 1, end ,dept + 1);
        }

    }
}
