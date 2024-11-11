import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int R = sc.nextInt();
        double uclid = 0.0;
        double taxiCab = 0.0;

        uclid = 3.14159265359 * Math.pow(R,2);
        taxiCab = 2 * Math.pow(R,2);
        System.out.println(String.format("%.5f",uclid));
        System.out.println(String.format("%.5f",taxiCab));



    }
}
