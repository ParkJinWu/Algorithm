import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        for(int i = 1; i <=N ; i++){
            System.out.println(" ".repeat(N-i) + "*".repeat(i + (i-1)));
        }
        for(int i = N-1 ; i > 0 ; i--){
            System.out.println(" ".repeat(N-i) + "*".repeat(i + (i-1)));
        }
    }
}
