import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

// 부분 수열의 합
public class Main {
    static boolean[] visited;
    static int N,S;
    static int result = 0;

    //
    private static void getSequence(int[] sequence, int target, int index, int sum){
        // 탈출 조건
        if(index == N){
            if (sum == target) {
                result++;
            }
            return;
        }

        // 포함하지 않는 경우
        getSequence(sequence,target,index + 1, sum);
        // 포함하는 경우
        getSequence(sequence,target,index + 1, sum + sequence[index]);
    }


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer token = new StringTokenizer(br.readLine());

        N = Integer.parseInt(token.nextToken()); // 정수의 개수
        S = Integer.parseInt(token.nextToken()); // 타겟 정수

        int[] sequence = new int[N];
        visited = new boolean[N];

        token = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            sequence[i] = Integer.parseInt(token.nextToken());
        }

        getSequence(sequence,S,0,0);

        if(S == 0) result--;
        System.out.println(result);
    }
}
