import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();
        long resul = 0;
        long sum = 0;

        for(int num = 1; ; num++){
            sum += num;
            if(sum > N) break;
            resul = num;
        }
        System.out.println(resul);

    }
}
