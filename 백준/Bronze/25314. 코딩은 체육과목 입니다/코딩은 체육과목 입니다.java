import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = "long ";
        int N = sc.nextInt() / 4 ;

        System.out.println(str.repeat(N)+ "int");

    }
}
