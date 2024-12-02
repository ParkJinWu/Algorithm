import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine()); // 테스트 케이스 개수
        for (int t = 0; t < T; t++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken()); // 서쪽 사이트 개수
            int M = Integer.parseInt(st.nextToken()); // 동쪽 사이트 개수

            // 팩토리얼 기반 이항 계수 계산
            BigInteger facM = factorial(M);
            BigInteger facN = factorial(N);

            // C(M, N) = M! / (N! * (M-N)!)
            BigInteger result = facM.divide(facN.multiply(factorial(M - N)));
            sb.append(result).append("\n");
        }

        System.out.println(sb);
    }

    // BigInteger를 이용한 팩토리얼 계산
    public static BigInteger factorial(int n) {
        BigInteger fac = BigInteger.ONE;

        for (int i = 2; i <= n; i++) {
            fac = fac.multiply(BigInteger.valueOf(i));
        }

        return fac;
    }
}
