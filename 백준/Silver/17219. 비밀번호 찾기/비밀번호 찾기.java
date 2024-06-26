import java.io.*;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
    // 비밀번호 찾기
    // 주소 N, 비밀번호 찾으려는 주소의 수 M
    // 뒤에서 M까지 찾으려는 주소의 수가 있다 해당 하는 주소의 비밀번호를 출력
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer token = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(token.nextToken());
        int M = Integer.parseInt(token.nextToken());

        HashMap<String,String> map = new HashMap<>();

        for(int i = 0 ; i < N ; i++){
            token = new StringTokenizer(br.readLine());
            String url = token.nextToken();
            String pwd = token.nextToken();
            map.put(url,pwd);
        }

        for(int i = 0 ; i < M ; i++){
            bw.write(map.get(br.readLine()) + "\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
