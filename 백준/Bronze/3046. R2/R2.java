import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int R1 = sc.nextInt();
        int S = sc.nextInt();

        System.out.print((2*S) - R1);
    }
}
