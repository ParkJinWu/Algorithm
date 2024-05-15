import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int A = Integer.parseInt(br.readLine());
        String B = String.valueOf(br.readLine());
        StringBuilder sb = new StringBuilder(B);

        String reverseB = sb.reverse().toString();
        int[] num = new int[reverseB.length()];

        for(int i = 0 ; i < num.length ; i++){
            num[i] = Integer.parseInt(String.valueOf(reverseB.charAt(i)));
        }


        for (int i = 0 ; i < num.length ; i++){
            System.out.println(A * num[i]);
        }
        System.out.print(A * Integer.parseInt(B));

    }
}