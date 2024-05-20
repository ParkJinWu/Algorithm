import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer token = new StringTokenizer(br.readLine()," ");

        String A = token.nextToken();
        String B = token.nextToken();

        StringBuilder reverseA = new StringBuilder(A).reverse();
        StringBuilder reverseB = new StringBuilder(B).reverse();

        int num1 = Integer.parseInt(reverseA.toString()); // StringBuilder의 반환값은 StringBuilder이기 때문에 String으로 변환 후 정수형 변환해야함
        int num2 = Integer.parseInt(reverseB.toString());

        System.out.print(num1 > num2 ? num1 : num2);

    }

}
