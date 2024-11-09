import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 3; i++) {
            BigDecimal sum = new BigDecimal(0);

            int N = Integer.parseInt(br.readLine());

            for (int j = 0; j < N; j++) {
                BigDecimal number = new BigDecimal(br.readLine());
                sum = sum.add(number);
            }
            if(sum.compareTo(BigDecimal.ZERO) == 0){
                System.out.println("0");
            } else if (sum.compareTo(BigDecimal.ZERO) > 0) {
                System.out.println("+");
            }else {
                System.out.println("-");
            }
        }
    }
}
