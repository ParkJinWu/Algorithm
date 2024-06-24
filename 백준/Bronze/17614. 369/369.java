import java.util.Scanner;

public class Main {
    static int clap = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();


        for(int num = 1 ; num <= N ; num++){
           is369(num);
        }
        System.out.println(clap);
    }

    public static int is369(int n){
        while (n > 0){
            int digit = n % 10;
            if(digit == 3 || digit == 6 || digit == 9){
                clap++;
            }
            n/=10;
        }
        return clap;
    }
}
