import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String A = String.valueOf(br.readLine());
        String B = String.valueOf(br.readLine());
        System.out.println(A.length() < B.length() ? "no" :"go");
    }
}