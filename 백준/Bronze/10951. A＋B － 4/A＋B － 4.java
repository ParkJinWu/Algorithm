
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer token ;
        String str ;

        while ((str = br.readLine()) != null){
            token = new StringTokenizer(str," "); // 분리
            int A = Integer.parseInt(token.nextToken());
            int B = Integer.parseInt(token.nextToken());

            sb.append(A+B).append("\n");

        }
        System.out.println(sb);
    }
}
