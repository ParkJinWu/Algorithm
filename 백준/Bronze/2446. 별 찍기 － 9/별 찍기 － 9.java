import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        for(int i = 0 ; i < N  ; i++){
            String space = " ".repeat(i);
            String star = "*".repeat(2 * (N-i) - 1);
            System.out.println(space+star);
        }

        for(int i = N-2 ; i >= 0  ; i--){
            String space = " ".repeat(i);
            String star = "*".repeat(2 * (N-i) - 1);
            System.out.println(space+star);
        }
    }

}
