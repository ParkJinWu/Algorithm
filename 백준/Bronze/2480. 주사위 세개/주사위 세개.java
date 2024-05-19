import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer token = new StringTokenizer(br.readLine(), " ");

        int A = Integer.parseInt(token.nextToken());
        int B = Integer.parseInt(token.nextToken());
        int C = Integer.parseInt(token.nextToken());

        int arr[] = {A,B,C};

        if(A == B && A ==C){ // 3개가 같은 경우
            System.out.println(10000 + A * 1000);
        } else if (A == B && A != C || A == C && A != B) { // 2개
            System.out.println(1000 + A * 100);
        } else if (B == C && B != A) {
            System.out.println(1000 + B * 100);
        } else {
            int max = Arrays.stream(arr).max().getAsInt();
            System.out.println(max * 100);
        }
    }
}
