import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for(int i = 1; i <= 2 * n -1 ; i++){
            if(i <= n){
                System.out.println("*".repeat(i));
            }else {
                System.out.println("*".repeat(2 * n - i));
            }
        }
    }
}
