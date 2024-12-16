import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
* N과 M(3)
* 중복 X
* 오름차순
* */
public class Main {
    static int[] sequence;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer token = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(token.nextToken());
        int M = Integer.parseInt(token.nextToken());

        sequence = new int[M];
        getSequence(1,N,0);

        System.out.println(sb);
    }

    public static void getSequence(int start, int end, int idx){
        if(idx == sequence.length){
            for (int i = 0; i < sequence.length; i++) {
                sb.append(sequence[i]).append(" ");
            }
            sb.append("\n");
            return;
        }

        for (int i = 1; i <= end ; i++) {
            sequence[idx] = i ;
            getSequence(i, end, idx + 1);

        }
    }
}
