import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String  X = sc.next();
        String  Y = sc.next();

        int numX = rever(X);
        int numY = rever(Y);
        int sum = numX + numY;

        System.out.println(rever(Integer.toString(sum)));
    }
    public static int rever(String str){
        StringBuilder sb = new StringBuilder(str);
        return Integer.parseInt(sb.reverse().toString());
    }
}
