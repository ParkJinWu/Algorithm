import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int L = sc.nextInt();
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int D = sc.nextInt();

        int math = A % C == 0 ? A / C : A / C + 1;
        int korean = B % D == 0 ? B / D : B / D + 1;

        System.out.println(L-Math.max(math,korean));

    }
}
