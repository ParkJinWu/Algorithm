import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer token = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        long a = Long.parseLong(token.nextToken());
        long b = Long.parseLong(token.nextToken());

        // a와 b의 대소 관계를 정렬하여 작은 값부터 순회
        long start = Math.min(a, b) + 1;
        long end = Math.max(a, b);
        int cnt = 0;

        for(long i = start; i < end; i++){
            cnt++;
            sb.append(i).append(" ");
        }
        System.out.println(cnt);
        if (sb.length() > 0) {
            sb.deleteCharAt(sb.length() - 1); // 마지막 문자 삭제
        }
        System.out.println(sb.toString());
    }
}
