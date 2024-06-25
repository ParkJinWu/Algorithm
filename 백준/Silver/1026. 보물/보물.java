import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {
    // 보물
    // A[N-1] × B[N-1] = S
    // S가 최솟값을 갖도록 배열을 재배치
    // 큰값 * 작은값
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer token;
        int N = Integer.parseInt(br.readLine());


        int[] A = new int[N];
        Integer[] B = new Integer[N];

        token = new StringTokenizer(br.readLine());
        for(int i = 0 ; i < N ; i++){
            A[i] = Integer.parseInt(token.nextToken());
        }

        token = new StringTokenizer(br.readLine());
        for(int i = 0 ; i < N ; i++){
            B[i] = Integer.parseInt(token.nextToken());
        }

        Arrays.sort(A);
        Arrays.sort(B,Collections.reverseOrder());

        int sum = 0;
        for(int i = 0 ; i < N ; i++){
            sum+= A[i] * B[i];
        }

        System.out.println(sum);

    }
}
