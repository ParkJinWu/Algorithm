import java.io.*;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main {
    // 붙임성 좋은 총총이
    // ChongChong을 시작으로 연결된 모든 사람의 수
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());

        StringTokenizer token ;
        HashSet<String> set = new HashSet<>();
        set.add("ChongChong");

        for(int i = 0; i < N ; i++){
            token = new StringTokenizer(br.readLine());
            String A = token.nextToken();
            String B = token.nextToken();

            if(set.contains(A) || set.contains(B)){
                set.add(A); set.add(B);
            }
        }

        br.close();
        bw.write(set.size() + "\n");
        bw.flush();
        bw.close();

    }
}
