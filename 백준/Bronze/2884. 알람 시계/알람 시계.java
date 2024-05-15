import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final int MAX_HOUR = 24;
        final int MAX_MIN = 60;
        Scanner sc = new Scanner(System.in);
        int hour = sc.nextInt();
        int min = sc.nextInt();

        if(min < 45){
            hour--;
            min = MAX_MIN - (45-min);

            if(hour<0) hour = MAX_HOUR+hour;
            System.out.println(hour + " " + min);
        }else {
            System.out.println(hour + " " +(min-45));
        }
    }
}
