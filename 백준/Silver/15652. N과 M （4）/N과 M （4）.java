import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static StringBuilder sb = new StringBuilder();
    static int[] sequence ;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer token = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(token.nextToken());
        int M = Integer.parseInt(token.nextToken());

        sequence = new int[M];

        getSequence(1,N,0);
        System.out.println(sb);
    }

    public static void getSequence(int start, int end, int depth){
        if(depth == sequence.length){
            for (int i = 0; i < sequence.length; i++) {
                sb.append(sequence[i]).append(" ");
            }
            sb.append("\n");
            return;
        }

        for (int i = start; i <= end; i++) {
            sequence[depth] = i;
            getSequence(i , end, depth + 1);
        }
    }

}
