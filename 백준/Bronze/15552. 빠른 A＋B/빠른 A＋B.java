import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());
        StringTokenizer token ;

        for(int i = 0 ; i < T ; i++){
            token = new StringTokenizer(br.readLine(), " ");
            int A = Integer.parseInt(token.nextToken()); // String -> int
            int B = Integer.parseInt(token.nextToken()); // String -> int

            bw.write(A+B+"\n");
        }

        bw.flush();
    }
}
