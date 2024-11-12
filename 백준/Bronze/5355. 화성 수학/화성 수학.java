import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Objects;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer token;
        int T = Integer.parseInt(br.readLine());
        double result = 0.0;

        for (int i = 0; i < T; i++) {
            token = new StringTokenizer(br.readLine());
            double number = Double.parseDouble(token.nextToken());
            while (token.hasMoreTokens()){
                String operation = token.nextToken();
                if (operation.equals("@")) {
                    number *= 3;
                } else if (operation.equals("#")) {
                    number -= 7;
                } else if (operation.equals("%")) {
                    number += 5;
                }
            }
            System.out.printf("%.2f\n", number);
        }
    }
}
